package mx.gob.zacatecas.enumerados.utilerias;

public enum Tipo{
	SERVER("Servidor"),
	WORKSTATION("Estacion de trabajo"),
	DESKTOP("Escritorio"),
	LAPTOP("Portatil");

	private String type;

	private Tipo(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}