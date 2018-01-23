/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.visitor;

import sabloane1.elemente_carte.Imagine;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Sectiune;
import sabloane1.elemente_carte.Tabel;
import sabloane1.structural.proxy.ImageProxy;

/**
 *
 * @author octavian
 */
public class SaveVisitor implements Visitor {

    @Override
    public void visit(Tabel x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Paragraf x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Imagine x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(ImageProxy x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void visit(Sectiune x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
