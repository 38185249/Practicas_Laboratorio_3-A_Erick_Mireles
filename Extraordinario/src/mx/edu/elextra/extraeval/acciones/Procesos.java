public class Procesos{
	// ArrayList que almacena Dispositivos
	private int idx = 0; //indice para moverse en el ArrayList
	
	private Procesos(){}

	public void getPrev(JTextField JTextField JTextField JLabel){
		// Si el tamaño de la lista es 0 llamar a JOptionPane siguiente y terminar el método
		JOptionPane.showMessageDialog(null, "Lista vacia");
		// restar a idx 1; en caso de ser 0 no realizar la resta
		// establecer la etiqueta del indice en el valor que corresponda; ejemplo 1/20
		llenarCampos(marca, costo, ramP);
	}
	public void getNext(JTextField JTextField JTextField JLabel){
		// Si el tamaño de la lista es 0 llamar a JOptionPane siguiente y terminar el método
		JOptionPane.showMessageDialog(null, "Lista vacia");
		// sumar a idx 1; en caso de ser igual al tamaño de la lista no hacer el incremento
		// establecer la etiqueta del indice en el valor que corresponda; ejemplo 20/20
		llenarCampos(marca, costo, ramP);
	}
	private void llenarCampos(JTextField JTextField JTextField ){
		// Obtener el elemento de la lista en la posición del indice
		// Con los valores marca costo y ram/procesador mostrar en las cajas de texto
		// Considerar que puede ser una Computadora o un Celular
	}
	public void sortMarca(){
		// Si la lista está vacía, no se ordena
		// Ordenar por Marca
	}
	public void sortCosto(){
		// Si la lista está vacía, no se ordena
		// Ordenar por Marca
	}
	public void openFile(){
		System.out.println("Nombre del archivo:");
		// Por medio de un Scanner obtener el nombre de un archivo
		// Verificar si el archivo existe
		// No existe se llama al siguiente JOptionPane y termina el método
			JOptionPane.showMessageDialog(null, "El archivo no existe");
		// Si el archivo existe crear un BufferedReader para leer el contenido del archivo
		// Con cada linea del archivo llamar al método
				agregarLinea(linea);
	}
	private void agregarLinea(String){
		// Separar la linea por comas ','
		// si no tiene 4 elementos mostrar el siguiente JOptionPane y terminar el método
			JOptionPane.showMessageDialog(null, "Formato incorrecto");
		// Con los datos separados por coma:
		// Si el primer elemento es una c, crear una Computadora y agregar a la lista
		// Si el primer elemento es una p, crear un Celular y agregar a la lista
		// para lo anterior se debe de verificar con un try que los datos se pueden convertir a numéricos
	}
}