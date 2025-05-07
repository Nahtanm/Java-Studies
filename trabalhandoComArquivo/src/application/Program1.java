package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program1 {
    public static void main(String[] args) {
        //Caminho do arquivo
        String path = "/home/nahtanm/Documentos/in.txt";

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try{

            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            while (line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (fileReader != null){
                    fileReader.close();
                }
            }catch (IOException e ){
                e.printStackTrace();
            }
        }

    }
}
