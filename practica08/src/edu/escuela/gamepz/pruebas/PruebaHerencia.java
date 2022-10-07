package edu.escuela.gamepz.pruebas;

import edu.escuela.gamepz.personajes.Personaje;
import edu.escuela.gamepz.personajes.buenos.Planta;
import edu.escuela.gamepz.personajes.malos.Zombie;

public class PruebaHerencia {
    public static void main(String[] args) {
        int num = 0;
    
        Personaje per01 = new Personaje("David", 100);
        Personaje per02 = new Personaje("Bianca");
        Planta plan01 = new Planta("Fabian", 10, 'B');
        Planta plan02 = new Planta("Almendra", 50);
        Planta plan03 = new Planta("Ricardo", 'C');
        Planta plan04 = new Planta("Silvia");
        Zombie zom01 = new Zombie("Armando", 80, false);
        Zombie zom02 = new Zombie("Josseline", true);
        Zombie zom03 = new Zombie("Eduardo");
        
        Personaje [] personajes = {per01, per02, plan01, plan02, plan03, plan04, zom01, zom02, zom03};
        for (Personaje a : personajes) {
            num = num + 1;
            a.getDetalle();
            int aleat = (int) (Math.random()*100);
            if (a instanceof Planta){
                Planta tmp = (Planta) a;
                System.out.println("Soy planta " + tmp.getEscudo());
                tmp.addVida(aleat);
            }
            if (a instanceof Zombie){
                Zombie tmp = (Zombie) a;
                System.out.println("Soy planta " + tmp.getAtaque());
                tmp.decVida(aleat);
            }
            System.out.print(aleat);
            a.getDetalle();
            System.out.print("***** Objeto " + num + " *****");
        }
    }
}
