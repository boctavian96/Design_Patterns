/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.creational.singleton;

/**
 *
 * @author octavian
 */
public class Singleton {
    
    public static volatile Singleton instance = null;

private Singleton(){}

public static Singleton getInstance(){
    if(instance == null){
        instance = new Singleton();
    }
    
    return instance;
}
    
}
