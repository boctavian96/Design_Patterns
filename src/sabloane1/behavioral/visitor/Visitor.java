/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.visitor;

import sabloane1.elemente_carte.Imagine;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Tabel;
import sabloane1.structural.proxy.ImageProxy;
import sabloane1.elemente_carte.Sectiune;

/**
 *
 * @author octavian
 */
public interface Visitor {
   public void visit(Tabel x);
   public void visit(Paragraf x);
   public void visit(Imagine x);
   public void visit(ImageProxy x);
   public void visit(Sectiune x);
}
