package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.Personaje;

public class PruebaCiclos {

    public static void main(String[] args){
        Personaje per01 = new Personaje("Diego");
        Personaje per02 = new Personaje("Almendra");
        Personaje per03 = new Personaje("Blanca");
        Personaje per04 = new Personaje("Jordan");

        int n = 0;
        int m = 0;

        
    }
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
            //Persona 1
            ed = (int) (Math.random()*250);
            per01.setEdad(ed);
            if (per01.setEdad(ed) == true){
                per01.getDetalle();
                System.out.println("Se modifico la edad");
            }else{
                per01.getDetalle();
                System.out.println("Sin modificacion de edad a " + ed);
            }
            //Persona 2
            ed = (int) (Math.random()*250);
            per02.setEdad(ed);
            if (per02.setEdad(ed) == true){
                per02.getDetalle();
                System.out.println("Se modifico la edad");
            }else{
                per02.getDetalle();
                System.out.println("Sin modificacion de edad a " + ed);
            }
            //Persona 3
            ed = (int) (Math.random()*250);
            per03.setEdad(ed);
            if (per03.setEdad(ed) == true){
                per03.getDetalle();
                System.out.println("Se modifico la edad");
            }else{
                per03.getDetalle();
                System.out.println("Sin modificacion de edad a " + ed);
            }

            do{
                ed = (int) (Math.random()*200);
                System.out.println(ed);
                if (ed > 150){
                    System.out.println("***El numero generado es mayor a 150***");
                }
            }while (per04.setEdad(ed) == false);
            per04.getDetalle();
        }
    }
    
    public int getVariablen(){
        return n;
    }
    public int getVariablem(){
        return m;
    }
}
