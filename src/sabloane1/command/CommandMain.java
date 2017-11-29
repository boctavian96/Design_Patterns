/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1.command;

/**
 *
 * @author octavian
 */
public class CommandMain {
    
    public static void main(String[] args){
        Command open = new OpenCommand();
        open.execute();
        Command statistics = new StatisticsCommand();
        statistics.execute();
    }
    
}
