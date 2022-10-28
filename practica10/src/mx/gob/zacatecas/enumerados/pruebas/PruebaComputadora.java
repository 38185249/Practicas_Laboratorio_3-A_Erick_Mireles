package mx.gob.zacatecas.enumerados.pruebas;
import mx.gob.zacatecas.enumerados.utilerias.*;
import mx.gob.zacatecas.enumerados.equipos.*;

public class PruebaComputadora{
	public static void main(String[] args) {
		Computadora c1 = new Computadora("HP",Tipo.DESKTOP,Memoria.DDR);
		Computadora c2 = new Smallfactor("Dell", Tipo.SERVER,Memoria.DDR4,false);
		Computadora c3 = new Computadora("Lenovo", Tipo.LAPTOP,Memoria.DDR2);
		Computadora c4 = new Computadora("Asus", Tipo.LAPTOP,Memoria.DDR3);

		Computadora computadoras [] = {c1,c2,c3,c4};

		for (Computadora tmp : computadoras) {
			System.out.println(tmp);
		}

	}
}