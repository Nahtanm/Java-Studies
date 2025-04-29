package br.nsantos.triangulo2;

public class Triangulo2 {

    public double ladoUm;
    public double ladoDois;
    public double ladoTres;

    public double calcularArea() {
        double p = (ladoUm + ladoDois + ladoTres) / 2.0;
        return Math.sqrt(p * (p - ladoUm) * (p - ladoDois) * (p - ladoTres));
    }

}
