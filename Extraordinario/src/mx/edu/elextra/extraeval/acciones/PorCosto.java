package mx.edu.elextra.extraeval.acciones;

import java.util.Comparator;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;

public class PorCosto implements Comparator<Dispositivo>{
    public int compare(Dispositivo o1, Dispositivo o2) {
        if (o1.getCosto() != o2.getCosto()){
            return (o1.getCosto()<o2.getCosto())? -1:1;
        }
        return o1.getMarca().compareTo(o2.getMarca());
    }

}