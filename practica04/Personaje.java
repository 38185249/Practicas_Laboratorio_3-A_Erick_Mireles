public class Personaje{

    private String nombre;
    private int edad = 0;
    
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void saludar(){
        System.out.println("Hola alumno de POO " + nombre);
    }
    public boolean setEdad(int edad){
        this.edad = edad;
        if (edad > 0 && edad <= 120){
            return true;
        }else{
            return false;
        }
    }
    public int getEdad(){
        return edad;
    }
}