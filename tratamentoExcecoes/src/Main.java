import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");


        scanner.close();

    }

    public static void method1(){
        System.out.println("***** METHOD1 START *****");
        method2();
        System.out.println("***** METHOD1 END *****");
    }

    public static void method2(){
        System.out.println("****** METHOD2 START *****");
        try{
            String[] strings = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(strings[position]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid position! ");
            //Mostra a chamada de metodos
            e.printStackTrace();
            scanner.next();
        }catch (InputMismatchException e){
            System.out.println("Input error");
        }
        System.out.println("***** METHOD2 END *****");
    }
}