/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.command;

import sabloane1.elemente_carte.Element;
import sabloane1.singleton.DocumentManager;

/**
 *
 * @author octavian
 */
public class DeleteCommand implements Command {

    @Override
    public void execute() {
        
        Element boo = DocumentManager.getElement();
        System.out.println("Deleted");
    }
    
}
