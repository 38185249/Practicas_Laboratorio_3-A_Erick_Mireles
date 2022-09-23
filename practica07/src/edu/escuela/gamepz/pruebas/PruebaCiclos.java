package edu.escuela.gamepz.pruebas;

import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos {
    
    Personaje per01 = new Personaje("Diego");
    Personaje per02 = new Personaje("Almendra");
    Personaje per03 = new Personaje("Blanca");
    Personaje per04 = new Personaje("Jordan");

    int n = 0;
    int m = 0;

    public void setVariables(int n, int m){
        while (n >= m){
            n = (int) (Math.random()*100);
            m = (int) (Math.random()*100);
        }
        this.n = n;
        this.m = m;
    }
    public int getVariablen(){
        return n;
    }
    public int getVariablem(){
        return m;
    }

    for (){

    }
}
