package edu.escuela.gamepz.personajes;
public class Personaje{

    private String nombre;
    private int edad;
    
    public Personaje(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void setNombre(String nombre){
        if (nombre.length() > 5 && nombre.length() <= 25){
            this.nombre = nombre;
        }else{
            System.out.println("Nombre invalido");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);
    }
    public boolean setEdad(int edad){
        if (edad > 0 && edad <= 120){
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