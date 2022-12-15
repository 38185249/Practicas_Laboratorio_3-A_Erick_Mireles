package mx.edu.elextra.extraeval.dispositivos;

public class Celular extends Dispositivo{
	private float procesador;

	public Celular(String marca, float costo, float procesador){
		super(marca, costo);
		this.procesador = procesador;
	}
	public String toString(){
		return super.toString() + '\t' + procesador;
	}
	public float getProcesador(){
		return procesador;
	}
}