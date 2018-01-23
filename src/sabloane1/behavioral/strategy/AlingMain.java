/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.strategy;

import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Sectiune;

/**
 *
 * @author octavian
 */
public class AlingMain {
    public static void main(String[] args){
        
        final AlignStrategy a1 = new ColumnAlign();
        final AlignStrategy a2 = new LineAlign();
        final AlignStrategy a3 = new RaptorAlign();
        
        
        Sectiune s1 = new Sectiune();
        
        Paragraf p1 = new Paragraf("Paragraf 1");
        p1.setAlign(a1);
        p1.print();
        s1.add(p1);
        
        Paragraf p2 = new Paragraf("Paragraf 2");
        p2.setAlign(a2);
        p2.print();
        s1.add(p2);
    }
}
