package mx.soft.parc1.series;
import mx.soft.parc1.parcial.Serie;
public class TestSeries{
    public static void main(String[] args){
        int x = 100;
        Serie s = new Serie(x);
        int m = s.genNumero((Math.random()*x*10));
        s.primos(m);
    }
}