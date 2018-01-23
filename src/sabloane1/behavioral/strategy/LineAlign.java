/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.strategy;

/**
 *
 * @author octavian
 */
public class LineAlign implements AlignStrategy {

    @Override
    public void printAligned(String text) {
        System.out.println("Printez pe linie " + text);
    }
    
}
