/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.elemente_carte;

import sabloane1.observer.SubjectElement;
import sabloane1.strategy.*;
import sabloane1.visitor.Visitor;
/**
 *
 * @author octavian
 */
public class Paragraf extends SubjectElement {
    private String paragraf;
    private AlignStrategy as = null;
    
    public Paragraf(String paragraf)
    {
        this.paragraf = paragraf;
    }
    
    public void setAlign(AlignStrategy as)
    {
        this.as = as;
        notifyAllObservers();
    }
    
    @Override
    public void print()
    {
        if(as != null)
            as.printAligned(paragraf);
        else 
            System.out.println(paragraf);
    }
    
    public void add(Element e){
        notifyAllObservers();
    }
       
    @Override
    public void acceptVisitor(Visitor v)
    {
        v.visit(this);
        notifyAllObservers();
    }
    
    @Override 
    public String toString()
    {
        return paragraf;
    }
}
