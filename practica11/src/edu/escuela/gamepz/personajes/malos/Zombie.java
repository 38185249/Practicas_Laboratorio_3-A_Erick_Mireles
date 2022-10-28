package edu.escuela.gamepz.personajes.malos;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;

public class Zombie extends Personaje implements Muerto{
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
    public String toString(){
        return super.toString() + '\t' + this.ataque;
    }
    public void decVida(){
        if (vida > 0 && getAtaque() == false){
            this.vida -= 3;
        }else if(getAtaque() == true){
            this.vida -= 2;
        }
    }
    public void decVida(int a){
        if (vida > 0 && getAtaque() == false){
            this.vida -= 3 * a;
        }else if(getAtaque() == true){
            this.vida -= 2 * a;
        }
    }
    public void addVida(){
        if (vida > 0 && getAtaque() == true){
            this.vida -= 3;
        }
    }
    public void addVida(int a){
        if (vida > 0 && getAtaque() == true){
            this.vida -= 3 * a;
        }
    }
    public void comer(){
        
    }

}
