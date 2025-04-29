package br.com.nsantos;

import br.com.nsantos.concretebuilder.ConcretePDFBuilder;

public class ComdandoCriarPDF {

    public static PDFNota executar(NotaDeNegociacao nota){
        ConcretePDFBuilder concretePdf = new ConcretePDFBuilder();

        Diretor diretor = new Diretor(concretePdf);

        diretor.gerarArquivo(nota);

        return concretePdf.obterPdf();

    }

}
