package mx.parc1.soft.series;

public class Serie {
    int x = 100;
    int num;
    public Serie(int num){
        this.num = num;
    }
    public void genNumero(int num){
        num = (int)(Math.random()*x*10);
        while (num < 100){
            this.num = num;
        }
    }
    public String primos(int num){
        System.out.println(num + " ");
    }
}
