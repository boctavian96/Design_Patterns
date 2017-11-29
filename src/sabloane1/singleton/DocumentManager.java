/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.singleton;

import sabloane1.elemente_carte.Element;

/**
 *
 * @author octavian
 */
public class DocumentManager {
    
    public static volatile DocumentManager instance = null;
    private static Element book;
    
    private DocumentManager(){}
    
    public static DocumentManager getInstance(){
        if(instance == null){
            synchronized(DocumentManager.class){
                if(instance == null){
                    DocumentManager.instance = instance = new DocumentManager();
                }
            }
        }
        return instance;
    }
    
    public static Element getElement(){
        return book;
    }
    
}
