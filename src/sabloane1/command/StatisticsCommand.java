/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.command;

import sabloane1.behavioral.visitor.DocumentStatisticsVisitor;
import sabloane1.creational.singleton.DocumentManager;
import sabloane1.elemente_carte.Element;

/**
 *
 * @author octavian
 */
public class StatisticsCommand implements Command {
    
    private DocumentStatisticsVisitor dsv;
    private DocumentManager dm;

    @Override
    public void execute() {
        DocumentStatisticsVisitor dsv = new DocumentStatisticsVisitor();
        Element book = DocumentManager.getInstance().getElement();
        book.acceptVisitor(dsv);
        dsv.printStatistics();
        
    }
    
}
