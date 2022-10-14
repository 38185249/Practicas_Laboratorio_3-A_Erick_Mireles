package mx.desasof.Inmobiliaria.casas;

public class Campo extends Casa{
    
    private float piscina[];

    public Campo(String tipo, int hab, float costo, float ancho, float largo) {
        super(tipo, hab, costo);
        this.piscina[0] = ancho;
        this.piscina[1] = largo;
    }
    public Campo(String tipo, float ancho, float largo){
        super(tipo);
        this.piscina[0] = ancho;
        this.piscina[1] = largo;
    }
    public int hashCode(){
        return (int) (((super.hashCode()) * piscina[0] * piscina[1]) / 5);
    }
    public boolean equals(Campo objeto){
        boolean result = false;
        if ((super.equals(objeto)) && objeto instanceof Campo){
            return result = true;
        }
        return result;
    }
    public String toString(){
        return super.toString() + '\t' + piscina[0] + '\t' + piscina[1];
    }
}