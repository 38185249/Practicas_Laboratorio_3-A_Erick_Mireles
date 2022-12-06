package ex.ordinario.www.eval.acciones;

import java.util.Comparator;
import ex.ordinario.www.eval.vehiculos.Vehiculo;

public class PorCosto implements Comparator<Vehiculo>{
    public int compare(Vehiculo p1, Vehiculo p2) {
        if (p1.getCosto() != p2.getCosto()){
            return (p1.getCosto()<p2.getCosto())? -1:1;
        }
        if(p1.getModelo() != p2.getModelo()){
            return p2.getModelo() - p1.getModelo();
        } 
        return p1.getMarca().compareTo(p2.getMarca());
    }
}