package Aula08;

import java.util.Scanner;

public class Exercicio01 {
    public static void getMesPorExtenso (int numero, int codigo){
        if (codigo==1){
            switch (numero){
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                }

            }else if(codigo==2){
            switch (numero){
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Informe o mês:");
        int numero=read.nextInt();

        System.out.println("Informe a opção\n" +
                "1-Mês em português\n" +
                "2-Mês em inglês");
        int opcao=read.nextInt();
        getMesPorExtenso(numero,opcao);

    }
}

