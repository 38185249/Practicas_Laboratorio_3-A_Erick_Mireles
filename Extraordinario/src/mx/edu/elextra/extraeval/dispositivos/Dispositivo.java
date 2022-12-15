public class Dispositivo implements Comparable<Dispositivo>{
	private String marca;
	private float costo;

	public Dispositivo(String marca, float costo){
		this.marca = marca;
		this.costo = costo;
	}
	public String toString(){
		return marca + '\t' + costo;
	}
	public String getMarca(){
		return marca;
	}
	public float getCosto(){
		return costo;
	}
	public int compareTo(Dispositivo o) {
		if(this.marca.compareTo(o.marca) !=0){
			return this.marca.compareTo(o.marca);
		}
		if(this.costo == o.costo){
			return 0;
		}
		return (o.costo < this.costo)? -1 : 1;                                                                                                                                                                                                                                                                   
	}
}