import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(1);
        integerList.add(6);
        integerList.add(5);
        integerList.add(3);
        integerList.add(2,45);

        System.out.println("Tamanho: " + integerList.size());
        Integer integer = integerList.stream().filter(x -> x > 6).findFirst().orElse(null);
        System.out.println(integer);

        System.out.println("--------------------------------");

        integerList.stream().filter(x -> x < 6).forEach(x -> System.out.println(x));

        System.out.println("--------------------------------");

        integerList.forEach( x -> System.out.println(x));
        System.out.println("--------------------------------");

        integerList.removeIf(x -> x < 6);

        integerList.forEach( x -> System.out.println(x));

        System.out.println("--------------------------------");
        System.out.println(integerList.indexOf(6));


    }
}