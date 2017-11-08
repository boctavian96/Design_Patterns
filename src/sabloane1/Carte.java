/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabloane1;

import sabloane1.metadate.Cuprins;
import java.util.List;
import java.util.ArrayList;
import sabloane1.elemente_carte.Element;
import sabloane1.visitor.Visitor;

/**
 *
 * @author octavian
 */
public class Carte {
    private List autor;
    private List capitol;
    private Cuprins cuprins;
    private String titlu;
    private ArrayList<Element> continut;
    
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
    
    public void acceptVisitor(Visitor v)
    {
        for(Element i : continut)
            i.acceptVisitor(v);
    }
}
