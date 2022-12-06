package ex.ordinario.www.eval.vehiculos;
public class Terrestre extends Vehiculo{
	int llantas;

	public Terrestre(String marca, int modelo, float costo, int llantas) {
		super(marca, modelo, costo);
		this.llantas = llantas;
	}
	public String toString(){
		return super.toString() + '\t' + llantas;
	}
}