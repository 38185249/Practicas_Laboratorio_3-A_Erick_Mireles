package mx.parc1.soft.series;

public class Serie {
    int x = 100;
    int n;
    public Serie(int n){
        this.n = n;
    }
    public void genNumero(int n){
        while (n < 100){
            n = (int)(Math.random()*x*10);
        }
        this.n = n;
        
    }
    public String primos(int n){
        System.out.println(n + " ");
    }
}
