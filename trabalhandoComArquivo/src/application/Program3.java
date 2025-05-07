package application;

import java.io.*;

public class Program3 {
    public static void main(String[] args) {

        String path = "/home/nahtanm/Documentos/out.txt";

        String[] lines = {"Good morning", "Good afternoon","Good night"};

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){

            for(String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        String path2 = "/home/nahtanm/Documentos/out.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path2))){

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
