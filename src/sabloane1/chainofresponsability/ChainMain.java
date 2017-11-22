/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.chainofresponsability;

/**
 *
 * @author octavian
 */
public class ChainMain {
    public static void main( String[] args ) {
        Image[] inputImages = {new IMG_XY(), new IMG_XY(), new Holy_Troll_img(), new IMG_XY(), new Holy_Troll_img(), new Holy_Troll_img()};
        ProcessManager[] processors = {new ProcessManager(), new ProcessManager(), new ProcessManager()};
        for (int i=0, j; i < inputImages.length; i++) {
            System.out.println("Operation #" + (i + 1) + ":");
            j = 0;
            while (!processors[j].execute(inputImages[i])) {
                j = (j + 1) % processors.length;
            }
            System.out.println();
        }
    }
}