package mx.soft.parc1.series;
import mx.soft.parc1.parcial.Serie;
public class TestSeries{
    public static void main(String[] args){
        int x = 100;
        Serie s = new Serie();
        int m = s.genNumero((int) Math.random()*x*10);
        s.primos(m);
    }
}