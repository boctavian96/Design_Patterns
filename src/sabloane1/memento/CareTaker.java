/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author octavian
 */
public class CareTaker {
    private final List<Memento> mementoList = new ArrayList<>();
    
    public void add(Memento state){
        mementoList.add(state);
    }
    
    public Memento get(int index){
        return mementoList.get(index);
    }
}
