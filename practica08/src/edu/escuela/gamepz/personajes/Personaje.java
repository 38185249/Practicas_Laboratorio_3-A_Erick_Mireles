package edu.escuela.gamepz.personajes;
public class Personaje{

    private String nombre;
    private int vida = 0;
    
    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        int vida = 3;
    }
    public void setNombre(String nombre){
        if (nombre.length() > 5 && nombre.length() < 25){
            System.out.println("Nombre validado = " + nombre);
            this.nombre = nombre;
        }else{
            System.out.println("Nombre invalido = " + nombre);
        }
    }
    public String getNombre(){
        return nombre;
    }
    public boolean setVida(int vida){
        if (vida > 0 && vida <= 99){
            this.vida = vida;
            return true;
        }else{
            return false;
        }
    }
    public int getVida(){
        return vida;
    }
    public String getDetalle(){
        return nombre + '\t' + vida;
    }
    public void decVida(){
        this.vida = vida - 1;
        if (vida < 0){
            this.vida = 0;
        }
    }
    public void decVida(int a){
        this.vida = vida - a;
        if (vida < 0){
            this.vida = 0;
        }
    }
    public void addVida(){
        this.vida = vida + 1;
        if(vida > 99){
            this.vida = 99;
        }
    }
    public void addVida(int a){
        this.vida = vida + a;
        if(vida > 99){
            this.vida = 99;
        }
    }
}