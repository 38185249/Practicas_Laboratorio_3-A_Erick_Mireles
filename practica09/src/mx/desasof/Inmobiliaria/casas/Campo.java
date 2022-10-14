package mx.desasof.Inmobiliaria.casas;

public class Campo extends Casa{
    
    private float piscina[];

    public Campo(String tipo, int hab, float costo, float ancho, float largo) {
        super(tipo, hab, costo);
        piscina[0] = ancho;
        piscina[1] = largo;
    }
    public int hashCode(){
        return ((super.hashCode()))/5;
    }
    public boolean equals(Campo objeto){
        boolean result = false;
        if ((super.equals(objeto)) && objeto instanceof Campo){
            return result = true;
        }
        return result;
    }
}