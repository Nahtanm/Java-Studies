import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Integer numberLine = scanner.nextInt();
        Integer numberColumn = scanner.nextInt();


        Integer[][] matriz = new Integer[numberLine][numberColumn];

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = scanner.nextInt();
            }
        }

        Integer numberAux = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] == numberAux){
                    System.out.printf("Position: %d, %d%n", i, j);
                }
                if(matriz[i][j] == numberAux && j > 0){
                    System.out.printf("Left: %d%n", matriz[i][j-1]);
                }
                if(matriz[i][j] == numberAux && j + 1 < matriz[i].length ){
                    System.out.printf("Right: %d%n", matriz[i][j + 1]);
                }
                if(matriz[i][j] == numberAux && i - 1 >= 0){
                    System.out.printf("Up: %d%n", matriz[i - 1][j]);
                }
                if(matriz[i][j] == numberAux && i + 1 < matriz.length){
                    System.out.printf("Down: %d%n", matriz[i + 1][j]);
                }
            }

        }

       scanner.close();

    }
}
