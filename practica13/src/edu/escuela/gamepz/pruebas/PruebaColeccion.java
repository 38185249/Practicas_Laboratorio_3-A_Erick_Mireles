package edu.escuela.gamepz.pruebas;

import java.util.LinkedList;
import java.util.TreeSet;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;

public class PruebaColeccion {
    public static void main(String[] args) {
        Personaje[] datos = {
            new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
            new Planta("Bianca",Tablero.genVida()),
            new Planta("Fabian",Tablero.genVida()),
            new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
            new Zombie("Bianca",Tablero.genVida()),
            new Planta("Dayan",Tablero.genVida()),
            new Zombie("Armando",Tablero.genVida(),false),
            new Zombie("Dayan",Tablero.genVida(),true),
            new Zombie("Armando",Tablero.genVida())
        };
        TreeSet arbol = new TreeSet();
        LinkedList lista = new LinkedList<Personaje>();

        for (Personaje tmp : datos) {
            arbol.add(tmp);
            lista.add(tmp);
        }
        
    }
}
