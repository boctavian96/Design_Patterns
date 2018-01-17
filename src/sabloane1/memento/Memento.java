/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.memento;

/**
 *
 * @author octavian
 */
public class Memento {
    private String state;
    
    public Memento(String state){
        this.state = state;
    }
    
    public String getState(){
        return state;
    }

    
}
