import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import ex.ordinario.www.eval.vehiculos.Vehiculo;

public class Procesos{
	ArrayList lista = new ArrayList<Vehiculo>();
	
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
			String t = modelo.getText();
			String c = costo.getText();
			llantas.getText();
			if(modelo.){
				llenaTxArea(txContenido);
			}
	}

	public void addAcuatico(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField remos){
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