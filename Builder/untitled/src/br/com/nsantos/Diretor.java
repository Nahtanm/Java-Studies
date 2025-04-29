package br.com.nsantos;

import br.com.nsantos.builder.Builder;

public class Diretor {

    public Builder builder;

    public Diretor(Builder builder){
        this.builder = builder;
    }

    public void gerarArquivo(NotaDeNegociacao notaDeNegociacao){

        builder.createCabecalho();
        builder.createParagrafo();

    }

}
