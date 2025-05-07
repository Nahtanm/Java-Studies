import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("/home/nahtanm/Documentos/in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }

        finally {
            if (scanner != null){
                scanner.close();
            }
        }

    }
}