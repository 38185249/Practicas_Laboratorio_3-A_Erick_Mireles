package mx.parc1.soft.series;

public class Serie {
    int x = 100;
    int n;
    public Serie(int n){
        this.n = n;
    }
    public int genNumero(int n){
        while (n < 100){
            n = (int)(Math.random()*x*10);
            System.out.println("Numero generado = "+ n);
            if (n % 2 == 0){
                System.out.println("Numero es par = "+ n);
                this.n = n; 
            }else{
                System.out.println("Numero no es par = "+ n);
            }
        }
        return n;
    }
    public String primos(int n){
        for (int i = 0; i == n; i++){
            if (i % 2 == 0){
               System.out.println(n + " ");
            }
        }
        return String.valueOf(n);
    }
    
}
