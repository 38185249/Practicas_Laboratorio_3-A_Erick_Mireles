package practica09.casas;

public class Casa {
    
    private String tipo;
    private int hab;
    private float costo; 

    public Casa(String tipo, int hab, float costo){
        this.tipo = tipo;
        this.hab = hab;
        this.costo = costo;
    }
    public Casa(String tipo){
        this.tipo = tipo;
        this.hab = 2;
        this.costo = 200000;
    }
    public int hashCode(){
        return (tipo.hashCode() * hab * costo);
    }
    public boolean equals(Casa objeto){
        boolean result = false;
        if (())
    }
}
