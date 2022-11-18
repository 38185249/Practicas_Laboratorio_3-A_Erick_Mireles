package edu.escuela.gamepz.pruebas;

import java.util.*;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;

public class PruebaColeccion {
    public static void main(String[] args) {
        String path = "D:/MIS DOCUMENTOS/IngSoft3B/POO/Practicas_Laboratorio_3-A_Erick_Mireles/practica14/";
        Scanner s = new Scanner(System.in);
        String fname = ;

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
        TreeSet<Personaje> arbol = new TreeSet<>();
        LinkedList<Personaje> lista = new LinkedList<>();

        for (Personaje tmp : datos) {
            arbol.add(tmp);
            lista.add(tmp);
        }

        System.out.println(" - - - Orden Natural - - - ");
        for (Personaje p : arbol){
            System.out.println(p);
        }

        System.out.println(" - - - Orden Vida - - - ");
        Collections.sort(lista,new ByVida());
        for (Personaje p : lista){
            System.out.println(p);
        }
        
        ArrayList<Personaje> arr = new ArrayList<>();
        arr.addAll(lista);
        
        System.out.println(" - - - Orden Tamanio - - - ");
        Collections.sort(arr, new BySize());
        for (Personaje p : arr){
            System.out.println(p);
        }
    }
}
