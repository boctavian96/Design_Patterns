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
import sabloane1.elemente_carte.Element;

/**
 *
 * @author octavian
 */
public class JSONBuiler implements Builder {
    
    private final String filename;
    private Element document;
    
    public JSONBuiler(String filename){
        this.filename = filename;
    }
    
    @Override
    public void buildPart() {
        ObjectMapper jsonMp = new ObjectMapper();
        HashMap<String, Object> hm;
        try {
            hm = jsonMp.readValue(new File(filename), HashMap.class);
        } catch (IOException ex) {
            Logger.getLogger(JSONBuiler.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }

    @Override
    public Element getResult() {
        return document;
    }
    
   
    
}
