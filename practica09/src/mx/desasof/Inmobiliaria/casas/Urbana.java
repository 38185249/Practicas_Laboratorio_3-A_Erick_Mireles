package mx.desasof.Inmobiliaria.casas;

public class Urbana extends Casa{
    
    private int baños;

    public Urbana(String tipo, int hab, float costo, int baños){
        super(tipo, hab, costo);
        this.baños = baños;
    }
    public Urbana(String tipo, int baños){
        super(tipo);
        this.baños = baños;
    }
    public int hashCode(){
        return ((super.hashCode())*23);
    }
    public boolean equals(Urbana objeto){
        boolean result = true;
        if ((super.equals(objeto)) && objeto instanceof Urbana){
            return result = true;
        }
        return result;
    }
    public String toString(){
        return super.toString() + '\t' + baños;
    }
}
