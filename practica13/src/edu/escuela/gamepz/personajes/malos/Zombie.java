package edu.escuela.gamepz.personajes.malos;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.utils.Muerto;

public class Zombie extends Personaje implements Muerto{
    private boolean ataque;

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
    public boolean getAtaque(){
        return ataque;
    }
    public String toString(){
        return super.toString() + '\t' + ataque;
    }
    public void decVida(){
        if (vida > 0 && getAtaque() == false){
            this.vida -= 3;
            if (vida < 0){
                this.vida = 1;
            }
        }else if(getAtaque() == true){
            this.vida -= 2;
            if (vida < 0){
                this.vida = 1;
            }
        }
    }
    public void decVida(int a){
        if (vida > 0 && getAtaque() == false){
            this.vida -= 3 * a;
            if (vida < 0){
                this.vida = 1;
            }
        }else if(getAtaque() == true){
            this.vida -= 2 * a;
            if (vida < 0){
                this.vida = 1;
            }
        }
    }
    public void addVida(){
        if (vida < 99 && getAtaque() == true){
            this.vida += 3;
            if (vida > 99){
                this.vida = 99;
            }
        }else if (getAtaque() == false){
            this.vida += 2;
            if (vida > 99){
                this.vida = 99;
            }
        }
    }
    public void addVida(int a){
        if (vida > 0 && getAtaque() == true){
            this.vida -= 3 * a;
            if (vida > 99){
                this.vida = 99;
            }
        }else if (getAtaque() == false){
            this.vida -= 2 *a;
            if (vida > 99){
                this.vida = 99;
            }
        }
    }
    public void comer(){
        System.out.println("Come cerebros");
    }
}
