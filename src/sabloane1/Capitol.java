/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1;

import java.util.List;

/**
 *
 * @author octavian
 */
public class Capitol {
    private String titlu;
    private List<Subcapitol> subcapitol;

    public void setSubcapitol(List<Subcapitol> subcapitol) {
        this.subcapitol = subcapitol;
    }

    public String getTitlu() {
        return titlu;
    }

    public List<Subcapitol> getSubcapitol() {
        return subcapitol;
    }
    
    public void setTitlu(String x)
    {
        this.titlu = x;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(byte i=1; i < subcapitol.size(); i++)
        {
            sb.append(subcapitol.get(i)).append(" ");
        }
        return sb.toString();
    }
}
