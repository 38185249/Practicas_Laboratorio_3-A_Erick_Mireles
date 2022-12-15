package mx.edu.elextra.extraeval.acciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mx.edu.elextra.extraeval.dispositivos.Celular;
import mx.edu.elextra.extraeval.dispositivos.Computadora;
import mx.edu.elextra.extraeval.dispositivos.Dispositivo;

public class Procesos{
	// ArrayList que almacena Dispositivos
	ArrayList<Dispositivo> lista = new ArrayList<Dispositivo>();
	private int idx = 0; //indice para moverse en el ArrayList
	PorMarca sortmarca;
	PorCosto sortcosto;
	
	private Procesos(){}

	public void getPrev(JTextField demarca, JTextField decosto, JTextField deram, JTextField deproc){
		// Si el tamaño de la lista es 0 llamar a JOptionPane siguiente y terminar el método
		if(lista.size() == 0){
			JOptionPane.showMessageDialog(null, "Lista vacia");
			System.exit(0);
		}
		// restar a idx 1; en caso de ser 0 no realizar la resta
		if(this.idx != 0 && this.idx > 0){
			this.idx -= 1;
		}
		// establecer la etiqueta del indice en el valor que corresponda; ejemplo 1/20
		llenarCampos(demarca, decosto, deram, deproc);
	}
	public void getNext(JTextField demarca, JTextField decosto, JTextField deram, JTextField deproc){
		// Si el tamaño de la lista es 0 llamar a JOptionPane siguiente y terminar el método
		if(lista.size() == 0){
			JOptionPane.showMessageDialog(null, "Lista vacia");
			System.exit(0);
		}
		// sumar a idx 1; en caso de ser igual al tamaño de la lista no hacer el incremento
		if(this.idx != lista.size() && this.idx > 0){
			this.idx += 1;
		}
		// establecer la etiqueta del indice en el valor que corresponda; ejemplo 20/20
		llenarCampos(demarca, decosto, deram, deproc);
	}
	private void llenarCampos(JTextField demarca, JTextField decosto, JTextField deram, JTextField deproc){
		// Obtener el elemento de la lista en la posición del indice
		Dispositivo dispositivo = lista.get(idx);
		// dispositivo.getMarca();
		// dispositivo.getCosto();
		// if(dispositivo == (Computadora) dispositivo){
		// 	((Computadora) dispositivo).getRam();
		// }
		// if(dispositivo == (Celular) dispositivo){
		// 	((Celular) dispositivo).getProcesador();
		// }
		// Con los valores marca costo y ram/procesador mostrar en las cajas de texto
		demarca.setText(dispositivo.getMarca());
		decosto.setText(String.valueOf(dispositivo.getCosto()));
		deram.setText(Integer.toString(((Computadora) dispositivo).getRam()));
		deproc.setText(String.valueOf(((Celular) dispositivo).getProcesador()));
		// Considerar que puede ser una Computadora o un Celular
	}
	public void sortMarca(){
		// Si la lista está vacía, no se ordena
		// Ordenar por Marca
		for (Dispositivo dispositivo1 : lista) {
			for (Dispositivo dispositivo2 : lista) {
				sortmarca.compare(dispositivo1, dispositivo2);
			}
		}
	}
	public void sortCosto(){
		// Si la lista está vacía, no se ordena
		// Ordenar por Marca
		for (Dispositivo dispositivo1 : lista) {
			for (Dispositivo dispositivo2 : lista) {
				sortcosto.compare(dispositivo1, dispositivo2);
			}
		}
	}
	public void openFile(){
        Scanner s = new Scanner(System.in);
		
		String nombre = System.getProperty("user.home");
        nombre += System.getProperty("file.separator");

		System.out.println("Nombre del archivo:");
		// Por medio de un Scanner obtener el nombre de un archivo
        nombre += s.nextLine();
        System.out.println(nombre);
        File f = new File(nombre);
        s.close();

		// Verificar si el archivo existe
        if(f.exists()){
			// Si el archivo existe crear un BufferedReader para leer el contenido del archivo
			BufferedReader reader = new BufferedReader(new FileReader(f));
			String linea;
			linea = reader.readLine();
			// Con cada linea del archivo llamar al método
			agregarLinea(linea);
			reader.close();
        }
		// No existe se llama al siguiente JOptionPane y termina el método
		JOptionPane.showMessageDialog(null, "El archivo no existe");
		System.exit(0);
	}
	private void agregarLinea(String linea){
		// Separar la linea por comas ','
		String[] laslineas = linea.split(",");
		// si no tiene 4 elementos mostrar el siguiente JOptionPane y terminar el método
		if(laslineas.length != 4){
			JOptionPane.showMessageDialog(null, "Formato incorrecto");
			System.exit(0);
		}
		// Con los datos separados por coma:
		// Si el primer elemento es una c, crear una Computadora y agregar a la lista
		if(laslineas[0] == "c"){
			Computadora computadora = new Computadora(laslineas[0], laslineas[1], laslineas[2]);
			lista.add(computadora);
		}
		// Si el primer elemento es una p, crear un Celular y agregar a la lista
		// para lo anterior se debe de verificar con un try que los datos se pueden convertir a numéricos
	}
}