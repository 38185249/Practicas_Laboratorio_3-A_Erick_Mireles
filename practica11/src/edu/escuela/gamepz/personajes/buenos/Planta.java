package edu.escuela.gamepz.personajes.buenos;

import edu.escuela.gamepz.personajes.Personaje;

public class Planta extends Personaje{
    private char escudo;

    public char getEscudo(){
        return escudo;
    }
    public Planta(String nombre, int vida, char escudo){
        super(nombre, vida);
        this.escudo = escudo;
    }
    public Planta(String nombre, char escudo){
        super(nombre);
        super.setVida(3);
        this.escudo = escudo;
    }
    public Planta(String nombre, int vida){
        super(nombre, vida);
        this.escudo = 'A';
    }
    public Planta(String nombre){
        super(nombre);
        super.setVida(3);   
        this.escudo = 'A';
    }
    public String getDetalle(){
        return super.getDetalle() + " " + escudo;
    }
    public void decVida(){
        super.decVida();
        if (getEscudo() == 'A'){
            super.decVida();
        }
    }
    public void decVida(int a){
        super.decVida(a);
        if (getEscudo() == 'A'){
            super.decVida(a*2);
        }
    }
    public void addVida(){
        super.addVida();
        if (getEscudo() == 'A'){
        }
    }
    public void addVida(int a){
        super.addVida(a);
        if (getEscudo() == 'A'){
            super.addVida(a*2);
        }
    }
}
