/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.chainofresponsability;

import java.util.Random;

/**
 *
 * @author octavian
 */
public class ProcessManager {
    private static final Random RANDOM = new Random();
    private static int nextId = 1;
    private int id = nextId++;
    
    public boolean execute(Image img){
        if(RANDOM.nextInt(2) != 0){
            System.out.println("Process " + id + " Is busy");
            return false;
        }
        System.out.println("Process " + id + " works, result : " + img.doSomething());
        return true;
        
    }
}
