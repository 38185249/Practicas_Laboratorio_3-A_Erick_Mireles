import edu.escuela.gamepz.personajes.Personaje;

public class Tablero {
    
    static final int MAX_SIZE = 10;
    private static Personaje[] personajes = new Personaje[MAX_SIZE];

    private Tablero(){

    }
    public void mostrar(){
        System.out.println("\nInicio * * * Contenido del arreglo en Tablero");
        for (Personaje tmp: personajes){
            int lapos = +1;
            if(tmp == null){
                System.out.println(lapos + " - - - ");
            }else{
                System.out.println(lapos + " " +tmp);
            }
        }
        System.out.println("Fin * * * Contenido del arreglo en Tablero\n");
    }
    public void insertar(Personaje p, int pos) throws PersException{
        if (pos < 0 && pos > MAX_SIZE){
            throw new PersException("Indice fuera de rango ", pos);
        }else{
            personajes[pos] = p;
        }
    }
    public void borrar(int pos) throws PersException{
        if (pos < 0 && pos > MAX_SIZE){
            throw new PersException("Indice fuera de rango ", pos);
        }else if(personajes[pos] == null){
            throw new PersException("Si personaje para borrar ", pos);
        }else{
            personajes[pos] = null;
        }
    }
}