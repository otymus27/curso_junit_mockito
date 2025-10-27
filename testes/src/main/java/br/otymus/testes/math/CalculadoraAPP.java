package br.otymus.testes.math;

public class CalculadoraAPP {

    public Double somar(Double a, Double b) {
        return a + b;
    }

    public Double subtrair(Double a, Double b) {
        return a - b;
    }

    public Double multiplicar(Double a, Double b) {
        return a * b;
    }

    public Double dividir(Double a, Double b) {
        return a / b;
    }

    public Double calcularMedia(Double a, Double b) {
        return (a + b) / 2;
    }

    public Double calcularRaiz(Double a) {
        return Math.sqrt(a);
    }
}
