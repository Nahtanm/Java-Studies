package Operadores.comparacao;

public class Comparacao {
    public static void main(String[] args) {

        int numero1 = 43;
        int numero2 = 67;

        if(numero2 > numero1){//numero maior
            System.out.printf("Numero maior "+numero2);
        }else if(numero2 < numero1){//numero menor
            System.out.printf("Numero menor " + numero2);
        }else if(numero2 == numero1 && numero1 >= numero2){
            System.out.printf("Qualquer coisa");
        }

    }
}
