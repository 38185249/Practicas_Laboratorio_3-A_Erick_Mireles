package edu.escuela.gamepz.personajes;
public class Personaje{

    private String nombre;
    private int edad;
    
    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
    public boolean setEdad(int edad){
        if (edad > 0 && edad <= 120){
            System.out.println("Edad validada = " + edad);
            this.edad = edad;
            return true;
        }else{
            System.out.println("Edad invalida = " + edad);
            return false;
        }
    }
    public int getEdad(){
        return edad;
    }
    public void getDetalle(){
        System.out.println(nombre + '\t' + edad);
    }
}