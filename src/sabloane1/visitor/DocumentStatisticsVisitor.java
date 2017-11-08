/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.visitor;

import sabloane1.elemente_carte.Imagine;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Sectiune;
import sabloane1.elemente_carte.Tabel;
import sabloane1.proxy.ImageProxy;

/**
 *
 * @author octavian
 */
public class DocumentStatisticsVisitor implements Visitor {

    private int numarTabele = 0;
    private int numarParagrafe = 0;
    private int numarImagini = 0;
    private int numarSectiuni = 0;
    
    
    @Override
    public void visit(Tabel x) {
        numarTabele++;
    }

    @Override
    public void visit(Paragraf x) {
        numarParagrafe++;
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
    
    public int getNumarTabele()
    {
        return numarTabele;
    }
    
    public int getNumarParagrafe()
    {
        return numarParagrafe;
    }
    
    public int getNumarImagini()
    {
        return numarImagini;
    }
    
    public int getNumarSectiuni()
    {
        return numarSectiuni;
    }
}