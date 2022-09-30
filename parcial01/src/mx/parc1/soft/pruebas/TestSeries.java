package mx.parc1.soft.pruebas;
import mx.parc1.soft.series.Serie;
public class TestSeries{
    public static void main(String[] args){
        int x = 100;
        Serie s = new Serie(x);
        int m = s.genNumero(x);
        s.primos(m);
    }
}