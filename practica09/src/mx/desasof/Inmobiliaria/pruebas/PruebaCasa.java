package mx.desasof.Inmobiliaria.pruebas;

import mx.desasof.Inmobiliaria.casas.Campo;
import mx.desasof.Inmobiliaria.casas.Casa;
import mx.desasof.Inmobiliaria.casas.Urbana;

public class PruebaCasa {
        
    Casa [] casas = new Casa("Estandar", 3, 3000000),
                new Campo("Cazador", 3.5f, 10f),
                new Urbana("Residencia", 3, 2500000, 2),
                new Casa("Estandar", 3, 3000000),
                new Campo("Cazador", 3.5f, 10f),
                new Urbana("Residencia", 3, 2500000, 2),
                new Casa("Estandar"),
                new Campo("Cazador", 4, 15000, 3.5f, 5f),
                new Urbana("Residencia", 5);
    }
    public static void main(String[] args) {
        int i;
        while (i < casas.length){
            for (Casa c: casas){

            }
            i++;
        }
    }
}
