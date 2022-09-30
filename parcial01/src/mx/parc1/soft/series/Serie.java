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

            if (n % 2 == 0){
                this.n = n; 
            }
            for (int i = 0; i == n; i++){
                if (i % 2 == 0){
                    System.out.println(i + " ");
                }
            }
        }

    }
    public int getNumero(int n){
        return n;
    }
    public String primos(){
        System.out.println(n);
    }
}
