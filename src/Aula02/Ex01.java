package Aula02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Fazer um algoritmo que leia o
        // percurso em quilômetros, o tipo
        // do carro e informe o consumo estimado
        // de combustível, sabendo-se que um carro
        // tipo C faz 12 Km com um litro de gasolina,
        // um tipo B faz 9 Km e o tipo A, 8 Km por litro.

        float kmRodados;
        char tipoCarro;
        float total;

        Scanner teclado = new Scanner(System.in);

        //O objeto do tipo Scanner vai ler arquivos em tipo emput -- retorno de dados

        System.out.println("Informe o km");
        kmRodados= teclado.nextFloat();
        System.out.println("informe o tipo");
        tipoCarro= teclado.next().charAt(0);

        if( tipoCarro == 'c') {
            total = kmRodados / 12;
            System.out.println("O consumo estimado de cobustivel é" + total);

        }else if (tipoCarro == 'b'){
            total = kmRodados / 9;
            System.out.println("O consumo estimado de combustivel é" + total);
        } else if (tipoCarro == 'a') {
            total = kmRodados /12;
            System.out.println("O consumo estimado de combustivel é"+ total);
        }
    }
}
