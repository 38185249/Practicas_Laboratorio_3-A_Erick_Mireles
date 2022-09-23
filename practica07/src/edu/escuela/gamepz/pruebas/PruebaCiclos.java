package edu.escuela.gamepz.pruebas;

import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos {
    
    Personaje per01 = new Personaje("Diego");
    Personaje per02 = new Personaje("Almendra");
    Personaje per03 = new Personaje("Blanca");
    Personaje per04 = new Personaje("Jordan");

    int n = 0;
    int m = 0;

    public void setVariables(int n, int m){
        while (n >= m){
            n = (int) (Math.random()*100);
            m = (int) (Math.random()*100);
        }
        this.n = n;
        this.m = m;
        System.out.println("n = " +n);
        System.out.println("m = " +m);

        for (int i = n; i < m; i++){
            int ed = 0;
            ed = (int) (Math.random()*250);
            per01.setEdad(ed);
            if (setEdad() == true){
                per01.getDetalle();
            }else{
                System.out.println("Diego " + ed + "sin modificacion en edad a " +ed);
            }
            ed = (int) (Math.random()*250);
            per02.setEdad(ed);
            System.out.println("Almendra " + ed + "se modifico la edad");
            ed = (int) (Math.random()*250);
            per03.setEdad(ed);
            System.out.println("Blanca " + ed + "se modifico la edad");
            do{
                ed = (int) (Math.random()*200);
                System.out.println(ed);
                if (ed > 150){
                    System.out.println("***El numero generado es mayor a 150***");
                }
            }
    
            
        }
    }
    public int getVariablen(){
        return n;
    }
    public int getVariablem(){
        return m;
    }
}
