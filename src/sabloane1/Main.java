/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1;

import sabloane1.*;
import sabloane1.elemente_carte.*;
import sabloane1.metadate.*;
import sabloane1.proxy.*;
import sabloane1.strategy.*;

/**
 *
 * @author octavian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
