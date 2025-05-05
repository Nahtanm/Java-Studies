import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shape: ");
        Integer numberShapes = scanner.nextInt();

        for (int i = 1; i <= numberShapes; i++){

            System.out.printf("Shape #%d data:%n",i);
            System.out.print("Rectangle or Circle (r/c)? ");
            char recCir = scanner.next().charAt(0);

            scanner.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color1 = Color.valueOf(scanner.nextLine().toUpperCase());

            Shape shape = shaperSelected(recCir, color1);
            shapeList.add(shape);

        }

        System.out.println("SHAPE AREAS:");
        for(Shape x : shapeList){
            System.out.println(String.format("%.2f", x.area()));
        }

        scanner.close();
    }

    public static Shape shaperSelected(char recCir, Color color) {

        if (recCir == 'r'){
            System.out.print("Width: ");
            Double width = scanner.nextDouble();

            System.out.print("Heigth: ");
            Double heigth = scanner.nextDouble();
            return new Rectangle(color, width, heigth);
        }

        System.out.print("Radius: ");
        Double radius = scanner.nextDouble();
        return new Circle(color, radius);

    }
}