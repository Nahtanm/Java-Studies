package br.com.nsantos.concretebuilder;

import br.com.nsantos.PDFNota;
import br.com.nsantos.builder.Builder;

public class ConcretePDFBuilder implements Builder {

    private String cabecalho;
    private String paragrafo;


    @Override
    public void createCabecalho() {
        this.cabecalho = "cabecalho PDF";
    }

    @Override
    public void createParagrafo() {
        this.paragrafo = "paragrafo PDF";
    }

    public PDFNota obterPdf(){
        return new PDFNota(cabecalho, paragrafo);
    }

}
