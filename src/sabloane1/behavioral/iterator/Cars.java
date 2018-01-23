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
public class Cars implements Container{
    //Test
    public String car_names[] = {"BMW", "Mercedess", "Dacia", "Volkswagen", "Fiat"};

    @Override
    public Iterator getIterator() {
        return new CarsIterator();
    }
    
    private class CarsIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if (index < car_names.length){
                return true;
            }
            
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return car_names[index++];
            }
            
            return null;
        }
        
        
    }
    
    
}
