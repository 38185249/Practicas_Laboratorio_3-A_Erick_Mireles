package ex.ordinario.www.eval.ventanas;

import java.util.ArrayList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ex.ordinario.www.eval.acciones.PorMarca;
import ex.ordinario.www.eval.vehiculos.Acuatico;
import ex.ordinario.www.eval.vehiculos.Terrestre;
import ex.ordinario.www.eval.vehiculos.Vehiculo;

public class Procesos{
	ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
	
	private Procesos(){

	}

	private void llenaTxArea(JTextArea txContenido){
		txContenido.setText("");
		for (var vehiculos: lista) {
			txContenido.append(vehiculos.toString() + "\n");
		}
	}

	public void addTerrestre(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField llantas){
			String m = marca.getText();
			String mo = modelo.getText();
			String c = costo.getText();
			String ll = llantas.getText();
			try {
				if(mo.length()==(int)mo.length() && Float.parseFloat(c)==(float)Float.parseFloat(c)
					&& ll.length()==(int)ll.length()){
					Terrestre terrestre = new Terrestre(marca.getText(), mo.length(), Float.parseFloat(c), ll.length());
					lista.add(terrestre);
					llenaTxArea(txContenido);
				}
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
	}

	public void addAcuatico(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField remos){
			String m = marca.getText();
			String mo = modelo.getText();
			String c = costo.getText();
			String r = remos.getText();
			boolean rnew = false;
			
			try {
				if(mo.length()==(int)mo.length() && Float.parseFloat(c)==(float)Float.parseFloat(c)){
					if(r == null){
						rnew = false;
					}else{
						rnew = true;
					}
					Acuatico acuatico = new Acuatico(marca.getText(), mo.length(), Float.parseFloat(c), rnew);
					lista.add(acuatico);
					llenaTxArea(txContenido);
				}
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
	}


	public void sortMarca(JTextArea txContenido){
		//ordenar PorMarca
		llenaTxArea(txContenido);
	}

	public void sortModelo(JTextArea txContenido){
		//ordenar PorModelo
		llenaTxArea(txContenido);
	}

	public void sortCosto(JTextArea txContenido){
		//ordenar PorCosto
		llenaTxArea(txContenido);
	}
}