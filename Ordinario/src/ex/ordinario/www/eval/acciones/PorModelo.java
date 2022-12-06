package ex.ordinario.www.eval.acciones;

import java.util.Comparator;
import ex.ordinario.www.eval.vehiculos.Vehiculo;

public class PorModelo implements Comparator<Vehiculo>{
    public int compare(Vehiculo p1, Vehiculo p2) {
        if(p1.getModelo() != p2.getModelo()){
            return p2.getModelo() - p1.getModelo();
        } 
        if (p1.getCosto() != p2.getCosto()){
            return (p2.getCosto()<p1.getCosto())? -1:1;
		}
        return p1.getMarca().compareTo(p2.getMarca());
    }
}