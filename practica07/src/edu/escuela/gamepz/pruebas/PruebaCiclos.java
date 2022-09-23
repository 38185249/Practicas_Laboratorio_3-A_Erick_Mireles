package edu.escuela.gamepz.pruebas;

import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos {
    
    Personaje per01 = new Personaje("Diego");
    Personaje per02 = new Personaje("Almendra");
    Personaje per03 = new Personaje("Blanca");
    Personaje per04 = new Personaje("Jordan");

    int n = 0;
    int m = 0;

    while (n >= m){
        n = (int) (Math.random()*100);
        m = (int) (Math.random()*100);
    }
    public void setVariablen(){
        this.n = n;
    public void getVariablen(){
        return n;
    
    }public void getVariablem(){
        return m;
    }
    public void getVariables(){
        System.out.println(n + '\t' + m);
    }
}
