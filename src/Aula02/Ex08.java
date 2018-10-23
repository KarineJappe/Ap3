package Aula02;

import javax.swing.*;

public class Ex08 {
    public static void main(String[] args) {
       // Usando a classe JOptionPane para entrada de dados,
        // elabore uma classe que receba a nota de duas provas e
        // de um trabalho. Calcule e mostre a média e o resultado final
        // (aprovado ou reprovado). Para calcular a média utilize a fórmula
        // seguinte: média = (nota da prova 1 + nota da prova 2 + nota do trabalho) / 3.
        // Considere que a média mínima para aprovação é 6.
        double prova1;
        double prova2;
        double trabalho;
        double media;

        String read = JOptionPane.showInputDialog("Informe a nota da 1° prova:");
        prova1 = Double.parseDouble(read);
        read = JOptionPane.showInputDialog("Insira a nota da 2° prova:");
        prova2 = Double.parseDouble(read);
        read = JOptionPane.showInputDialog("Insira a nota do trabalho:");
        trabalho = Double.parseDouble(read);

        media = (prova1+ prova2 + trabalho) /3;
        System.out.println("Média final é "+ media);

        if(media>=6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }



    }
}
