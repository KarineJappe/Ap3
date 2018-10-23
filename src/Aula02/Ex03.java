package Aula02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        int n1;
        double n2;
        double n3;
        double n4;
        double n5;
        double total;
        //Faça um algoritmo para dar o total, em reais, de um cofrinho que contenha:
        //n1 moedas de 1 real;
        //n2 moedas de 50 centavos;
        //n3 moedas de 25 centavos;
        //n4 moedas de 10 centavos; e
        //n5 moedas de 5 centavos.

        Scanner teclado= new Scanner(System.in);

        System.out.println("Informe o número de moedas de 1 real:");
        n1 = teclado.nextInt();
        n1 *= 1;
        System.out.println("Informe o número de moedas de 50 centavos:");
        n2 = teclado.nextDouble();
        n2 *= 0.50;
        System.out.println("Informe o número de moedas de 25 centavos:");
        n3 = teclado.nextDouble();
        n3 *= 0.25;
        System.out.println("Informe o número de moedas de 10 centavos:");
        n4 = teclado.nextDouble();
        n4 *= 0.10;
        System.out.println("Informe o número de moedas de 05 centavos:");
        n5 = teclado.nextDouble();
        n5 *= 0.05;
        System.out.println("Total de moedas é "+(n1+n2+n3+n4+n5)+ " reais");

    }


}
