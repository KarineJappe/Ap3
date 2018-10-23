package Aula05e06;

import java.util.Scanner;

public class ExCinco {
    public static void main(String[] args) {
   //Elabore uma classe que receba 5 notas de alunos por meio, armazene essas notas
        // em um array de cinco elementos, apresente em tela as cinco notas em ordem
        // decrescente (da maior para a menor) e a média aritmética das notas.
        double notas []= new double[5];
        double media =0;
        Scanner read= new Scanner(System.in);

        for(int i=0; i<notas.length; i++){
            System.out.println("Notas:");
            notas[i] = read.nextDouble();
            media += notas[i];
        }
        for (int i=0; i<notas.length;i++){
            for (int j=i+1; j<notas.length;j++){
                if(notas[i]<notas[j]){
                    double temp=notas[j];
                    notas[j]=notas[i];
                    notas[i]=temp;
                }
            }
        }

        System.out.println("Vetor ordenado");
        for (int a=0; a<notas.length;a++){
            System.out.println(notas[a]);
        }
        media = media/notas.length;
        System.out.println("Média:"+media);
    }
}
