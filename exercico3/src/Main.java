import br.nsantos.entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("Name student: ");
        aluno.name = scanner.nextLine();

        System.out.print("Note one: ");
        aluno.notaUm = scanner.nextDouble();

        System.out.print("Note two: ");
        aluno.notaDois = scanner.nextDouble();

        System.out.print("Note three: ");
        aluno.notaTres = scanner.nextDouble();

        System.out.println("FINAL GRADE = " + aluno.finalGrade() + "\n"
                            + aluno.validateStudent());

    }
}