/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.elemente_carte;

import sabloane1.strategy.*;
/**
 *
 * @author octavian
 */
public class Paragraf extends AbstractElement {
    private String paragraf;
    private AlignStrategy as;
    
    public Paragraf(String paragraf)
    {
        this.paragraf = paragraf;
    }
    
    public void setAlign(AlignStrategy as)
    {
        this.as = as;
    }
    
    @Override
    public void print()
    {
        as.printAligned(paragraf);
    }
    
    @Override 
    public String toString()
    {
        return paragraf;
    }
}
