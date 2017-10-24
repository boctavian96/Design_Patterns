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
public class Tabel extends AbstractElement {
    private String tabel;
    
    public Tabel(String tabel)
    {
        this.tabel = tabel;
    }
    
    @Override 
    public void print()
    {
        System.out.println(tabel);
    }
    
    @Override 
    public String toString()
    {
        return tabel;
    }
}
