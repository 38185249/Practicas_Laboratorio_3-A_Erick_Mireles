package edu.escuela.gamepz.pruebas;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;
import edu.escuela.gamepz.utils.Escudo;

public class PruebaTablero {
    public static void main(String[] args) {
        
        Personaje[] datos = {
            new Planta("David",100),
            new Zombie("Bianca"),
        new Planta("Fabian",10,MEDIO),
        new Planta("Almendra",50),
        new Planta("Ricardo",BAJO),
        new Planta("Silvia"),
        new Zombie("Armando",80,false),
        new Zombie("Josseline",true),
        new Zombie("Eduardo")
        };
    }
}
