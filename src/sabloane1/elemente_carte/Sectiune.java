/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.elemente_carte;

import java.util.List;
import java.util.ArrayList;
import sabloane1.behavioral.visitor.Visitor;
/**
 *
 * @author octavian
 */
public class Sectiune implements Element {
    
    private List<Element> continut;
    private String name;
            
    
    public Sectiune()
    {
        continut = new ArrayList<Element>();
    }
    
    public Sectiune(String nume)
    {
        continut = new ArrayList<Element>();
        this.name = nume;
    }
    

    @Override
    public void add(Element x) {
        continut.add(x);
    }

    @Override
    public void remove(Element x) {
        continut.remove(x);
    }

    @Override
    public void get(int x) {
        continut.get(x);
    }

    @Override
    public void print() {
        System.out.println("Works");
    }
        
    @Override
    public void acceptVisitor(Visitor v)
    {
        v.visit(this);
    }
    
}
