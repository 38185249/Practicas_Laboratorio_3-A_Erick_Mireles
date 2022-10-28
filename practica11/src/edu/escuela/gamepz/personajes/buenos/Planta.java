package edu.escuela.gamepz.personajes.buenos;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Escudo;

public class Planta extends Personaje{
    private Escudo escudo;

    public Escudo getEscudo(){
        return escudo;
    }
    public Planta(String nombre, int vida, Escudo escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, Escudo escudo){
        super(nombre);
        super.setVida(3);
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        super(nombre, vida);
        this.escudo = Escudo.NULO;
    }
    public Planta(String nombre){
        super(nombre);
        super.setVida(3);   
        this.escudo = Escudo.NULO;
    }
    public String toString(){
        return super.toString() + " " + escudo;
    }
    public void decVida(){
        if (vida > 0){
            this.vida - escudo;
        }
        // super.decVida();
        // if (getEscudo() == 'A'){
        //     super.decVida();
        // }
    }
    public void decVida(int a){
        // super.decVida(a);
        // if (getEscudo() == 'A'){
        //     super.decVida(a*2);
        // }
    }
    public void addVida(){
        // super.addVida();
        // if (getEscudo() == 'A'){
        // }
    }
    public void addVida(int a){
        // super.addVida(a);
        // if (getEscudo() == 'A'){
        //     super.addVida(a*2);
        // }
    }
}
