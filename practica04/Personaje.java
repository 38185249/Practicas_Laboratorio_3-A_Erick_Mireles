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
    public int getEdad(){
        return edad;
    }
    public boolean setEdad(int edad){
        if (edad > 0 && edad <= 120){
            this.edad = edad;
        }else{
            return false;
        }
    }
}