package mx.parc1.soft.series;

public class Serie {
    int x = 100;
    int n;
    public Serie(int n){
        this.n = n;
    }
    public void genNumero(int n){
        n = (int)(Math.random()*x*10);
        while (n < 100){
            this.n = n;
        }
    }
    public String primos(int n){
        System.out.println(n + " ");
    }
}
