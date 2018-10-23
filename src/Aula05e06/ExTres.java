package Aula05e06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExTres {
    public static void main(String[] args) {
        //Declare duas maneiras de declarar um array unidimensional de 12 doubles.

        double vetor[] = new double[12];
        double [] vetor2 = new double[12];
        double valor;
        String saida = "";
        String saida2= "";

        DecimalFormat formatar = new DecimalFormat();
        formatar.applyPattern("##0.00");
        // primeiro vetor
        Scanner read = new Scanner(System.in);

        for (int i=0; i<vetor.length; i++){
            System.out.println("Valor do 1° vetor, posição "+i);
            valor = read.nextDouble();
            saida += valor+ "/";
        }
        System.out.println(saida);
        //segundo vetor
        for (int i=0; i<vetor2.length; i++){
            vetor2[i] = Math.random()*100;
            saida2 += formatar.format(vetor2[i]) +"/";
        }
        System.out.println(saida2);
    }
}
