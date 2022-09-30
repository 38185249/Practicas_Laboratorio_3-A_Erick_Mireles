package mx.soft.parc1.series;
import mx.soft.parc1.parcial.Serie;
public class TestSeries{
    public static void main(String[] args){
        Serie s = new Serie();
        int m = s.genNumero((int) Math.random()*10);
        s.primos(m);
    }
}