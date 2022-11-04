import edu.escuela.gamepz.personajes.Personaje;

public class Tablero {
    
    static final int MAX_SIZE = 10;
    private static Personaje[] personajes = new Personaje[MAX_SIZE];

    private Tablero(){

    }
    public mostrar(){
        System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
        for(Personaje tmp: personajes){
            if(tmp == null){
                System.out.println(tmp + " - - - ");
            }else{
                System.out.println(tmp +);
            }
        }
    }
}