/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.builder;

import sabloane1.elemente_carte.Imagine;
import sabloane1.elemente_carte.Element;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Tabel;

/**
 *
 * @author octavian
 */
public class BuilderMain {
    public static void main(String[] args){
        Builder b = new JSONBuiler("book.json");
        Element book;
        
        b.buildPart(new Paragraf("Ana are mere"));
        book = b.getResult();
        book.print();
        
        b.buildPart(new Tabel("1 / 2 / 5 / 4 / 4"));
        book = b.getResult();
        book.print();
        
        b.buildPart(new Imagine("Red alert image"));
        book = b.getResult();
        book.print();
    }
}
