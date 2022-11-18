package edu.escuela.gamepz.pruebas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.*;

public class PruebaColeccion {
    public static void main(String[] args) {
        String path = System.getProperty("user.home");
        path += System.getProperty("file.separator");
        Scanner s = new Scanner(System.in);
        path += s.nextLine();
        System.out.println(path);
        File f = new File(path);
        s.close();

        if(f.exists()){
            if(f.isFile()){
                System.out.println("El archivo existe");
                return;
            }else{
                mostrarDirectorio(f);
                System.exit(0);
            }
        }
        
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

        guardarObjetos(f, arbol);
    }
    private static void mostrarDirectorio(File f) {
        String[] lista = f.list();
        for (String l : lista) {
            System.out.println(l);
        }
        
    }
    private static void guardarObjetos(File file, TreeSet<Personaje> t){
        try {
            FileOutputStream f = new FileOutputStream(file);
            ObjectOutputStream s = new ObjectOutputStream(f);
            for (Personaje p : t) {
                s.writeObject(p);
            }
            s.close();
        } catch (Exception e) {
            System.out.println("Error al guardar objetos: " + e);     
        }
    }
}
