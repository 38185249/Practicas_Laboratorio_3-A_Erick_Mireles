package mx.desasof.Inmobiliaria.casas;

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
    public String toString(){
        return tipo + '\t' + hab * '\t' + costo;
    }
    public int hashCode(){
        return (int) (tipo.hashCode() * hab * costo);
    }
    public boolean equals(Casa objeto){
        boolean result = false;
        if ((objeto != null) && (objeto instanceof Casa)){
            if ((tipo == objeto.tipo) && (costo == objeto.costo)){
                return result = true;
            }
        }
        return result;
    }
}