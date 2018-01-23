/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.command;

import sabloane1.elemente_carte.Element;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Sectiune;
import sabloane1.creational.singleton.DocumentManager;

/**
 *
 * @author octavian
 */
public class CreateSample implements Command {

    @Override
    public void execute() {
        Element book = new Sectiune("Book");
        book.add(new Paragraf("Ana are mere"));
        book.add(new Paragraf("Ana are pere"));
        DocumentManager.getInstance().getElement();
    }
    
}
