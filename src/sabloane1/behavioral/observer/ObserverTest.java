/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.observer;

import sabloane1.elemente_carte.Imagine;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Sectiune;

/**
 *
 * @author octavian
 */
public class ObserverTest {
    
    public static void main(String[] args){

        Observer o = new SimpleObserver();
        Paragraf p1 = new Paragraf("Paragraf1");
        Paragraf p2 = new Paragraf("Paragraf2");
        Imagine i1 = new Imagine("Iepure");
        Imagine i2 = new Imagine("Cal");
        Sectiune s = new Sectiune();
    
        p1.attach(o);
        p2.attach(o);
        
        p1.add(i1);
        p2.add(i2);
        
    }
    
    
    
    
}
