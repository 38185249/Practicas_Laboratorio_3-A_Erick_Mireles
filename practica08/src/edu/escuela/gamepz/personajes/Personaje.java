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
    public int getEdad(){
        return vida;
    }
    public void getDetalle(){
        System.out.println(nombre + '\t' + vida);
    }
    public void decVida(){

    }
    public void decVida(int a){

    }
}