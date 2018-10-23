package Aula02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {


// Usando a classe Scanner para entrada de dados,
    //crie uma classe que receba o valor de um produto
    // e a porcentagem de desconto, calcule e mostre o
    // valor do desconto e o valor do produto com o desconto.
    // Observação: o valor do desconto é calculado por meio da fórmula:
    // valor do desconto = valor do produto * percentual de desconto / 100.
    double valor;
    double desconto;
    double valorDesconto;
    double valorf;
        Scanner read = new Scanner(System.in);

        System.out.println("Valor do produto:");
        valor = read.nextDouble();
        System.out.println("Informe a porcentagem de desconto:");
        desconto = read.nextDouble();
        valorDesconto = valor*desconto/100;
        valorf = valor - valorDesconto;
        System.out.println("O valor de desconto é " + valorDesconto);
        System.out.println("O valor do produto com o desconto é "+ valorf);

    }
}