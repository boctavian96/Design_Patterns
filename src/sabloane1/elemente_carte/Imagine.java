/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.elemente_carte;

import sabloane1.visitor.Visitor;

/**
 *
 * @author octavian
 */
public class Imagine extends AbstractElement {
    private String img;

    public Imagine(String img)
    {
        this.img = img;
    }
    
    @Override
    public void print()
    {
        System.out.println(img);
    }
    
    @Override 
    public String toString()
    {
        return img;
    }
    
    @Override
    public void acceptVisitor(Visitor v)
    {
        v.visit(this);
    }
}
