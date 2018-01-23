/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.behavioral.iterator;

/**
 *
 * @author octavian
 */
public class IteratorDemo {
    
    public static void main(String[] args){
        Cars cars = new Cars();
    
        for(Iterator i = cars.getIterator(); i.hasNext();){
            String name = (String)i.next();
            System.out.println("Car : " + name );
        }
    
    }
}
