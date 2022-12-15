package mx.edu.elextra.extraeval.acciones;

import java.util.Comparator;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;

public class PorMarca implements Comparator<Dispositivo>{
    public int compare(Dispositivo o1, Dispositivo o2) {
        if(o1.getMarca().compareTo(o2.getMarca()) != 0){
			return o1.getMarca().compareTo(o2.getMarca());
        }
        if (o1.getCosto() == o2.getCosto()){
            return 0;
        }
        return (o2.getCosto()<o1.getCosto())? -1:1;
    }
}