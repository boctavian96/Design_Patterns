/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.elemente_carte;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author octavian
 */
public class Sectiune implements Element {
    
    private List<Element> continut;
    
    public Sectiune()
    {
        continut = new ArrayList<Element>();
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
    
}
