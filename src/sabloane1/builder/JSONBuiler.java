/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.builder;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import sabloane1.elemente_carte.AbstractElement;
import sabloane1.elemente_carte.Element;
import sabloane1.elemente_carte.Imagine;
import sabloane1.elemente_carte.Paragraf;
import sabloane1.elemente_carte.Sectiune;
import sabloane1.elemente_carte.Tabel;
import sabloane1.proxy.ImageProxy;
import sabloane1.visitor.Visitor;

/**
 *
 * @author octavian
 */
public class JSONBuiler implements Builder {
    
    private final String filename;
    private Element document;
    private Sectiune s;
    
    public JSONBuiler(String filename){
        this.filename = filename;
    }
    
    @Override
    public void buildPart(Element x) {
        ObjectMapper jsonMp = new ObjectMapper();
        HashMap<String, Object> hm = new HashMap<>();
        try {
            hm = jsonMp.readValue(new File(filename), HashMap.class);
        } catch (IOException ex) {
            Logger.getLogger(JSONBuiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        x.print();
        document = buildDoc(x, hm);
    }

    @Override
    public Element getResult() {
        return document;
    }
    
    private Element buildDoc(Element x, HashMap<String, Object> hm){
        Element result = null;
        
        if(x instanceof Paragraf){
            result = buildParagraf(hm);
        }else if(x instanceof Tabel){
            result = buildTabel(hm);
        }else if(x instanceof ImageProxy || x instanceof Imagine){
            result = buildImagine(hm);
        }else{
            System.out.println("Object type not accepted !!!");
        }
        return result;
    }
    
    private Element buildSectiune(HashMap<String, Object> hm){
       return new Sectiune();
    }

    private Element buildParagraf(HashMap<String, Object> hm) {
        System.out.println("Sunt Paragraf");
        return new Paragraf(filename);
    }
    
    private Element buildImagine(HashMap<String, Object> hm) {
        System.out.println("Sunt Imagine");
        return new ImageProxy(filename);
    }
    
    private Element buildTabel(HashMap<String, Object> hm) {
        System.out.println("Sunt Tabel");
        return new Tabel(filename);
    } 
    
}