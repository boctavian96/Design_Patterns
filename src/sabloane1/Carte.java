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
public class Carte {
    private List autor;
    private List capitol;
    private Cuprins cuprins;
    private String titlu;
    
    public Carte(List autor, List capitol, Cuprins cuprins, String Titlu)
    {
        this.autor = autor;
        this.capitol = capitol;
        this.cuprins = cuprins;
        this.titlu = Titlu;
    }

    public List getCapitol() {
        return capitol;
    }

    public Cuprins getCuprins() {
        return cuprins;
    }

    public String getTitlu() {
        return titlu;
    }
    
    public void setAutor(List x)
    {
        this.autor = x;
    }
    
    public List getAutor()
    {
        return autor;
    }
}
