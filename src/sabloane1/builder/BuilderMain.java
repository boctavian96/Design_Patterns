/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.builder;

import sabloane1.elemente_carte.Element;

/**
 *
 * @author octavian
 */
public class BuilderMain {
    public static void main(String[] args){
        Builder b = new JSONBuiler("book.json");
        b.buildPart();
        Element book;
        book = b.getResult();
        book.print();
    }
}
