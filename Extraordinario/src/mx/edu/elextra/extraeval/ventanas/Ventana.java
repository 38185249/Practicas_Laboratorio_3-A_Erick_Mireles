package mx.edu.elextra.extraeval.ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import mx.edu.elextra.extraeval.acciones.Procesos;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class Ventana extends JFrame{
	public Ventana(){
		initComponents();
		setJMenuBar(mb);
		mb.add(mnFile);
		mnFile.add(miOpen);
		mnFile.addSeparator();
		mnFile.add(miSalir);
		mb.add(mnSort);
		mnSort.add(miMarca);
		mnSort.add(miCosto);
		add(lbMarca);
		add(txMarca);
		add(lbCosto);
		add(txCosto);
		add(lbRamP);
		add(txRamP);
		add(btnPrev);
		add(lbIdx);
		add(btnNext);
		add(lbTipoOrd);
	}
	private void initComponents(){
		// Establecer el el tipo de JFrame como un FlowLayout
        setLayout(new FlowLayout());
		// Establecer el cierre de la aplicación al cerrar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Crear la Barra de Menú mb
		mb = new JMenuBar();
		setJMenuBar(mb);
		// Crear el Menú mnFile "Archivo"
		mnFile = new JMenu("Archivo");
		mb.add(mnFile);
		// Crear el Menú Item miOpen "Abrir"
		miOpen = new JMenuItem("Abrir");
		// Agregar al miOpen la clase anónima que manda llamar a los métodos siguientes: 
				// Procesos.openFile();
				// Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
		miOpen.addActionListener(new ActionListener(){
		public void actionPerformed(java.awt.event.ActionEvent e) {
			procesos.openFile();
			procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);
			}
		});
		mnFile.add(miOpen);
		//
		// Crear el Menú Item miOpen "Salir"
		miSalir = new JMenuItem("Salir");
		// Agregar al miOpen la clase anónima que manda llamar al método siguientes:
		miSalir.addActionListener(new ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e) {
				dispose();
				}
			});
		mnFile.add(miSalir);
		// Crear el menú mnSort "Ordenar por ..."
		// Crear el Menú Item miMarca "Marca"
		// Crear el Menú Item miCosto "Costo"

		// Crear la etiqueta lbMarca "Marca"
		// Crear la etiqueta lbMarca "Costo"
		// Crear la etiqueta lbRamP "Ram/Proc"
		
		// Crear el campo de texto txMarca de tamaño 20
		// Crear el campo de texto txCosto de tamaño 20
		// Crear el campo de texto txRamP de tamaño 20

		// Crear el botón btnPrev " <- "
		// Crear el botón btnNext " -> "

		// Crear la etiqueta lbIdx "0/0"
		
		String espacios = "       ";
		// Crear la etiqueta Label ordenando lbTipoOrd espacios+"Tipo de Ordenamiento"+espacios
		
		// Agregar al btnPrev la clase anónima que manda llamar al método siguientes:
				// Procesos.getPrev(txMarca, txCosto, txRamP, lbIdx);

		// Agregar al btnNext la clase anónima que manda llamar al método siguientes:
				// Procesos.getNext(txMarca, txCosto, txRamP, lbIdx);

		// Agregar al miMarca la clase anónima que manda llamar a los métodos siguientes: 
				lbTipoOrd.setText(espacios+"Ordenados por Marca"+espacios);
				// Procesos.sortMarca();

		// Agregar al miCosto la clase anónima que manda llamar a los métodos siguientes: 
				lbTipoOrd.setText(espacios+"Ordenados por Costo"+espacios);
				// Procesos.sortCosto();
		setSize(330,350);
	}
	JMenuBar mb;
	JMenu mnFile,mnSort;
	JMenuItem miOpen, miSalir, miMarca, miCosto;
	JLabel lbMarca, lbModelo, lbCosto, lbRamP, lbTipoOrd, lbIdx;
	JTextField txMarca, txCosto, txRamP;
	JButton btnPrev, btnNext;
	Procesos procesos;
}
