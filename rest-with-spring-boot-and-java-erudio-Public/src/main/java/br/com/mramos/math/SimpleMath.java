package br.com.mramos.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo)  {
        return numberOne + numberTwo;
    }

    public Double subtrair(Double numberOne,  Double numberTwo){
        return numberOne - numberTwo;
    }

    public Double multiplicar(Double numberOne,  Double numberTwo)  {
        return numberOne * numberTwo;
    }

    public Double dividir(Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }
    public Double media(Double numberOne, Double numberTwo)  {
        return (numberOne + numberTwo) / 2;
    }
    public Double quadrado(Double number) {
        return Math.sqrt(number);
    }

}
