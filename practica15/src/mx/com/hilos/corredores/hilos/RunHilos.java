package mx.com.hilos.corredores.hilos;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class RunHilos {
    public static void Iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
        char ch1 = txt1.getText().charAt(0);
        char ch2 = txt2.getText().charAt(0);

        if(txt1.getText() == null){
            txt1.setText("E");
        }
        if(txt2.getText() == null){
            txt2.setText("M");
        }

        String salida1 = String.valueOf(ch1);
        String salida2 = String.valueOf(ch2);

        elem1.setText(salida1);
        elem2.setText(salida2);
    }
}
