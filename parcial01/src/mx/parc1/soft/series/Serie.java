package mx.soft.parc1.parcial;

public class Serie {
    int num;
    public Serie(int num){
        this.num = num;
    }
    public void genNumero(int num){
        while (num < 100){
            this.num = num;
        }
    }
    public String primos(int num){
        System.out.println(num + " ");
    }
}
