package Aula05e06;

import java.util.Scanner;

public class ExNove {
    public static void main(String[] args) {
       // Usando um array unidimensional de 10 elementos do tipo ClasseString, faça uma classe
        // que simule a ocupação de um estacionamento de veículos. Considere que a posição
        //do array corresponde ao número da vaga e para cada vaga é armazenada a placa do
        // veículo que está estacionado. Sua classe deve conter um laço de repetição
        // simulando um menu que controle a entrada e a saída dos veí- culos com as opções:
        // 1-Entrada, 2-Saída e 3-Listar situação atual e 4-Encerrar o programa.
        // Se o usuário escolher 1, solicite o número da vaga e a placa do veículo;
        // se escolher 2, solicite o número da vaga que será liberada e armazene o
        // valor branco na posição correspondente ao array; se escolher 3, liste a
        // situação atual apresentando em tela todos os elementos do array; quando for 4,
        // encerre o laço e o programa.

        String estacionamento []= new String[10];
        String placa;
        int saida;
        int vaga=0;

        Scanner read = new Scanner(System.in);

        do{
            System.out.println("Menu\n" +
                    "1 - Entrada\n" +
                    "2 - Saída\n" +
                    "3 - Listar situação atual\n"+
                    "4- Encerrar o programa");
            saida= read.nextInt();

            switch (saida) {
                case (1):
                    System.out.println("Informe o nnúmero da vaga:");
                    vaga = read.nextInt();
                    System.out.println("Informe a placa do veículo:");
                    placa = read.next();
                    estacionamento[vaga]=placa;
                    break;
                case (2):
                    System.out.println("Informe o número da vaga a ser liberada:");
                    vaga= read.nextInt();
                    estacionamento[vaga]=" ";
                    break;
                case (3):
                     for (vaga =0; vaga<estacionamento.length;vaga++){
                         System.out.print(estacionamento[vaga]+"|");
                     }
                     break;
            }
        }while(saida!=4);

    }
}
