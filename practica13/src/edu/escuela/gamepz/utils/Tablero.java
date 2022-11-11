package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;

public class Tablero {
    
    public static final int MAX_SIZE = 10;
    private static Personaje[] personajes = new Personaje[MAX_SIZE];

    private Tablero(){

    }
    public static void mostrar(){
        System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
        int lapos = 0;
        for (Personaje tmp: personajes){
            lapos += 1;
            if(tmp == null){
                System.out.println(lapos + " - - - ");
            }else{
                System.out.println(lapos + " " +tmp);
            }
        }
        System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
    }
    public static void insertar(Personaje p, int pos) throws PersException{
        if (pos < 0 || pos >= MAX_SIZE){
            throw new PersException("Indice fuera de rango en ", pos);
        }else if(pos >= 0 && pos < MAX_SIZE){
            personajes[pos] = p;
        }
    }
    public static void borrar(int pos) throws PersException{
        if (pos < 0 || pos >= MAX_SIZE){
            throw new PersException("Indice fuera de rango en ", pos);
        }else if(pos < 0 || pos >= MAX_SIZE || personajes[pos] == null){
            throw new PersException("Si personaje para borrar en ", pos);
        }else if (pos >= 0 && pos < MAX_SIZE){
            personajes[pos] = null;
        }
    }
    public static int genVida(){
        return (int)(Math.random() * 10 + 1);
    }
}