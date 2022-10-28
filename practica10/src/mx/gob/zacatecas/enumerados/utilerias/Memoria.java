package mx.gob.zacatecas.enumerados.utilerias;

public enum Memoria{
	DDR("Memoria RAM",176f,30),
	DDR2("Laptop",240f,35),
	DDR3("Laptop nueva",533f,40),
	DDR4("Gamer",1600f,40);

	private String tipo;
	private float vel;
	private int pines;

	private Memoria(String tipo, float vel, int pines){
		this.tipo= tipo;
		this.vel = vel;
		this.pines = pines;
	}
	public String getTipo(){
		return tipo;
	}
	public float getVel(){
		return vel;
	}
	public int getPines(){
		return pines;
	}
}