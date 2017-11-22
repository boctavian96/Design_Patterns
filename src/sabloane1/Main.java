/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1;

import sabloane1.elemente_carte.*;
import sabloane1.strategy.*;
import sabloane1.visitor.DocumentStatisticsVisitor;

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
        
        
        //Visitor demo
        visitorDemo();
        
        
        
    }
    
    private static void visitorDemo()
    {
       Element[] list = {new Paragraf("Bere"), new Paragraf("Tuica"), new Paragraf("Alcool"), new Tabel("1, 4, 2, 3"), new Tabel("grn")};
       DocumentStatisticsVisitor visitor = new DocumentStatisticsVisitor();
       
       for(Element i : list)
       {
           i.acceptVisitor(visitor);
       }
       
       System.out.println("Numar paragrafe " + visitor.getNumarParagrafe());
       System.out.println("Numar tabele " + visitor.getNumarTabele());
       System.out.println("Numar imagini " + visitor.getNumarImagini());
       System.out.println("Numar sectiuni " + visitor.getNumarSectiuni());
    }
    
}
