package ex.ordinario.www.eval.vehiculos;
public class Acuatico extends Vehiculo{
	boolean remos;

	public Acuatico(String marca, int modelo, float costo, boolean remos) {
		super(marca, modelo, costo);
		this.remos = remos;
	}
	public String toString(){
		return super.toString() + '\t' + remos;
	}
}