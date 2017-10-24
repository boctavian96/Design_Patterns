/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.elemente_carte;

/**
 *
 * @author octavian
 */
class Paragraf extends AbstractElement {
    private String paragraf;
    
    public Paragraf(String paragraf)
    {
        this.paragraf = paragraf;
    }
    
    @Override
    public void print()
    {
        System.out.println(paragraf);
    }
    
    @Override 
    public String toString()
    {
        return paragraf;
    }
}
