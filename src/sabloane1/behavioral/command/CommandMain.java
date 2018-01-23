/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.command;

import sabloane1.elemente_carte.Element;
import sabloane1.creational.singleton.DocumentManager;

/**
 *
 * @author octavian
 */
public class CommandMain {
    
    public static void main(String[] args){
        Command open = new CreateSample();
        open.execute();
        Element book = DocumentManager.getElement();
        Command del = new DeleteCommand();
        del.execute();
        book.print();
    }
    
}
