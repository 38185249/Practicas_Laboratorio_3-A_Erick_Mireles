package mx.com.hilos.corredores.ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;

public class Ventana extends JFrame{
    JLabel lblTitulo, lblElem1, lblElem2, hElem1, hElem2;
    JTextField txtElem1, txtElem2;
    JButton btnStart;

    private Ventana(){
        initComponents();
    }

    private void initComponents(){
        int ancho = 550;
        int alto = 250;
        Dimension lblDim = new Dimension(ancho-15,alto/10);
        Color border = new Color(0, 0, 255);
        lblTitulo = new JLabel("* Practica 15 Manejo de hilos *");
        lblTitulo.setPreferredSize(lblDim);
        lblElem1 = new JLabel("Hilo 1");
        txtElem1 = new JTextField(3);
        lblElem2 = new JLabel("Hilo 2");
        txtElem2 = new JTextField(3);
        btnStart = new JButton("Comenzar");
        hElem1 = new JLabel(" Aqui va el hilo 1 ");
        hElem1.setBorder(BorderFactory.createLineBorder(border));
        hElem1.setPreferredSize(lblDim);
        hElem2 = new JLabel(" Aqui va el hilo 2 ");
        hElem2.setBorder(BorderFactory.createLineBorder(border));
        hElem2.setPreferredSize(lblDim);
        btnStart.setPreferredSize(lblDim);

    }
}