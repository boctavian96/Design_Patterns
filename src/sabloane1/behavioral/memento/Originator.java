/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.memento;

/**
 *
 * @author octavian
 */
public class Originator {
    private String state;
    
    public void setState(String state){
        this.state = state;
    }
    
    public String getState(){
        return state;
    }
    
    public Memento saveStateToMemento(){
        return new Memento(state);
    }
    
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
