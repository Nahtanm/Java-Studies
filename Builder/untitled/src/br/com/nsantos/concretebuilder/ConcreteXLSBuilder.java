package br.com.nsantos.concretebuilder;

import br.com.nsantos.XLSNota;
import br.com.nsantos.builder.Builder;

public class ConcreteXLSBuilder implements Builder {

    private String cabecalho;
    private String paragrafo;

    @Override
    public void createCabecalho() {
        this.cabecalho = "cabecalho XLS";
    }

    @Override
    public void createParagrafo() {
        this.paragrafo = "paragrafo XLS";
    }

    public XLSNota obterXLS(){
        return new XLSNota(cabecalho, paragrafo);
    }

}
