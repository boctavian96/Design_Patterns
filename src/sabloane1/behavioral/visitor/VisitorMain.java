/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.visitor;

import sabloane1.elemente_carte.Element;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Tabel;

/**
 *
 * @author octavian
 */
public class VisitorMain {
    public static void main(String[] args) {
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
