package mx.gob.zacatecas.enumerados.equipos;
import mx.gob.zacatecas.enumerados.utilerias.*;

public class Smallfactor extends Computadora{
	private boolean nvram;

	public Smallfactor(String marca, Tipo tipo, Memoria memoria, boolean nvram){
		super(marca,tipo,memoria);
		this.nvram = nvram;
	}

	public String toString(){
		return super.toString() + nvram;
	}
}