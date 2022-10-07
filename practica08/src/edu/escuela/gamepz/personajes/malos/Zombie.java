package edu.escuela.gamepz.personajes.malos;

import edu.escuela.gamepz.personajes.Personaje;

public class Zombie extends Personaje{
    private boolean ataque;

    public boolean getAtaque(){
        return ataque;
    }

    public Zombie(String nombre, int vida, boolean ataque){
        super(nombre, vida);
        this.ataque = ataque;
    }
    public Zombie(String nombre, boolean ataque){
        super(nombre);
        super.setVida(3);   
        this.ataque = ataque;
    }
    public Zombie(String nombre){
        super(nombre);
        super.setVida(3);
        this.ataque = false;
    }
    public String getDetalle(){
        return super.getDetalle() + " " + ataque;
    }
    public void decVida(){
        super.decVida();
        if (getAtaque() == false){
        }
    }
    public void decVida(int a){
        super.decVida(a);
        if (getAtaque() == false){
        }
    }
    public void addVida(){
        super.addVida();
        if (getAtaque() == true){
        }
    }
    public void addVida(int a){
        super.addVida(a);
        if (getAtaque() == true){
        }
    }
}
