/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1;

//Tema : Care ar fi solutia mai buna 

import java.util.List;

/**
 * 
 * @author octavian
 */
public class Subcapitol {
    private String titlu;
    private List<Paragraf> paragraf;
    private List<Imagine> img; 
    private List<Tabel> tabel;
    
    public void setTitlu(String x)
    {
        this.titlu = x;
    }
    
    public String getTitlu()
    {
        return titlu;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i < paragraf.size(); i++)
        {
            sb.append(paragraf.get(i).toString()).append(" ");
        }
        
        for(int i = 1; i < img.size(); i++)
        {
            sb.append(img.get(i).toString()).append(" ");
        }
        
        for(int i = 1; i < tabel.size(); i++)
        {
            sb.append(tabel.get(i).toString()).append(" ");
        }
        
        return sb.toString();
    }
}
