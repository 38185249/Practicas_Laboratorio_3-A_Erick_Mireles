package mx.com.hilos.corredores.hilos;

import javax.swing.JLabel;

public class Letra implements Runnable{
    char letra;
    JLabel etq;

    public Letra(JLabel etq, char letra){
        this.etq = etq;
        this.letra = letra;
    }

    public void run() {
        String cadena = etq.getText();

    }
}
