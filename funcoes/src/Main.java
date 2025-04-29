import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numeroAux = 0;

        for(int i = 0; i < 3 ; i++){
            System.out.printf("Informe um numero: ");
            double numero = in.nextDouble();
            numeroAux = numeroMaior(numero, numeroAux);
        }

        System.out.printf("Numero maior: " + numeroAux);

        in.close();

    }

    public static double numeroMaior(double numero, double numeroAux){
        if(numero > numeroAux){
            numeroAux = numero;
            return numeroAux;
        }
        return numeroAux;
    }
}