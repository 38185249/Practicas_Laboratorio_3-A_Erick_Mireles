package mx.com.hilos.corredores.hilos;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class RunHilos {
    public static void Iniciar(JTextField txt1, JTextField txt2, JLabel elem1, JLabel elem2){
        char ch1 = txt1.getText().charAt(0);
        char ch2 = txt2.getText().charAt(0);

        if(txt1 == null && txt2 == null){
            txt1.setText("E");
        }
    }
}
