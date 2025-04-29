package Operadores;

public class Ternario {
    public static void main(String[] args) {

        int numero1 = 32;
        int numero2 = 43;
        String resultado = (numero2 > numero1) ? "Numero maior " + numero2 : "Numero menor " + numero1;

        System.out.printf(resultado);
    }
}
