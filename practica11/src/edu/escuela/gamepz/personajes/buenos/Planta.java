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
        return super.toString() + '\t' + escudo.getNivel();
    }
    public void decVida(){
        if (vida > 0){
            this.vida -= (1 - escudo.getNivel());
        }
    }
    public void decVida(int a){
        if (vida > 0){
            this.vida -= (1 - (escudo.getNivel()) * a);
        }
    }
    public void addVida(){
        if (vida < 99){
            this.vida += (1 + escudo.getNivel());
        }
    }
    public void addVida(int a){
        if (vida < 99){
            this.vida += (1 + (escudo.getNivel()) * a);
        }
    }
}
