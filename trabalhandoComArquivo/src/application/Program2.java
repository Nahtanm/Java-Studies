package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {
    public static void main(String[] args) {

        String path = "/home/nahtanm/Documentos/in.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
