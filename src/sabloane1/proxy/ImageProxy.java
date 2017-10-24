/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.proxy;

import sabloane1.elemente_carte.AbstractElement;
import sabloane1.elemente_carte.Imagine;

/**
 *
 * @author octavian
 */
public class ImageProxy extends AbstractElement {

    private Imagine realImg = null;
    private String fileName = null;
    
    public ImageProxy(String fileName)
    {
        this.fileName = fileName;
    }

    @Override
    public void print() {
        if(realImg == null)
        {
            realImg = new Imagine(fileName);
        }
        
        realImg.print();
    }
    
}
