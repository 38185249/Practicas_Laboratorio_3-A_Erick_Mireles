package edu.escuela.gamepz.personajes;

import java.text.DecimalFormat;

public abstract class Personaje implements Comparable<Personaje>{

    private String nombre;
    protected int vida = 0;
    private float size;
    
    public Personaje(String nombre, int vida, float size) {
        this.nombre = nombre;
        this.vida = vida;
        this.size = size;
        if (size == 0.0f){
            this.size = genSize();
        }else{
            this.size = Math.round(size)/100;
        }
    }
    public Personaje(String nombre){
        this.nombre = nombre;
        this.vida = 3;
        this.size = 0.0f;
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
        }else {
            return false;
        }
    }
    public int getVida(){
        return vida;
    }
    public String toString(){
        return nombre + '\t' + vida;
    }
    public abstract void decVida();
   
    public abstract void decVida(int a);
   
    public abstract void addVida();
   
    public abstract void addVida(int a);

    public float genSize(){
        float size = (float) (Math.random()*10);
        DecimalFormat df = new DecimalFormat("#.00");
        size = Float.valueOf(df.format(size));
        return size;
    }
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public int compareTo(Personaje o) {
        if(this.nombre.compareTo(o.nombre) != 0){
            return this.nombre.compareTo(o.nombre);
        }
        if(this.nombre == o.nombre && this.vida ==o.vida){
            return this.size.compareTo(o.size);
        }
    }
    // public int compareTo(Personaje o) {
    //     if(o.getNombre() == o.nombre){
    //         return this.getVida().compareTo(o.getVida());
    //     }
    //     if(o.getNombre() == o.nombre && o.getVida() == o.getVida()){
    //         return this.size.compareTo(o.size);
    //     }
    //     return 0;
    // }
}