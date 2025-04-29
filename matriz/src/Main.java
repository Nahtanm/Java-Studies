import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Integer numberAux = scanner.nextInt();

        Integer[][] matriz = new Integer[numberAux][numberAux];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        Integer negativeNumber = 0;
        System.out.println("Diagonal principal:");
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (i == j){
                    System.out.print(matriz[i][j] + " ");
                }
                if(matriz[i][j] < 0){
                    negativeNumber += 1;
                }
            }
        }

        System.out.println("\nNegative number: " + negativeNumber);

    }
}