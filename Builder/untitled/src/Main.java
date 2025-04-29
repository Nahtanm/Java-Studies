import br.com.nsantos.ComdandoCriarPDF;
import br.com.nsantos.NotaDeNegociacao;
import br.com.nsantos.PDFNota;

public class Main {
    public static void main(String[] args) {

        NotaDeNegociacao notaDeNegociacao =  new NotaDeNegociacao();

        PDFNota nota = ComdandoCriarPDF.executar(notaDeNegociacao);

        System.out.println(nota);

    }
}