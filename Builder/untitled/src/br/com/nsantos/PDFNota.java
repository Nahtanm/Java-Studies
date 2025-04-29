package br.com.nsantos;

public class PDFNota {
    private String cabecalho;
    private String paragrafo;

    public PDFNota(String cabecalho, String paragrafo) {
        this.cabecalho = cabecalho;
        this.paragrafo = paragrafo;
    }

    @Override
    public String toString() {
        return "PDFNota{" +
                "cabecalho='" + cabecalho + '\'' +
                ", paragrafo='" + paragrafo + '\'' +
                '}';
    }

    public String getParagrafo() {
        return paragrafo;
    }

    public void setParagrafo(String paragrafo) {
        this.paragrafo = paragrafo;
    }

    public String getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(String cabecalho) {
        this.cabecalho = cabecalho;
    }
}
