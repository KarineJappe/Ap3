package Aula02;

import java.util.Scanner;

public class EX09 {
    public static void main(String[] args) {
        //Considere a seguinte informação a respeito do cálculo da aposentadoria.
        // Para se aposentar por idade, as mulheres precisam ter atingido 60 anos de
        // idade e os homens, 65. Já na aposentadoria por tempo de contribuição, o
        // tempo mínimo exigido é de 30 anos para as mulheres e de 35 anos para os homens.
        // Com base nessas informações, elabore uma classe que receba a idade de uma pessoa,
        // seu sexo e a quantidade de anos de contribuição. A seguir, calcule a quantidade
        // de anos que falta de con- tribuição para se aposentar, ou então emita a mensagem:
        // “você já tem o direito a aposentadoria”.
        int idade;
        String sexo;
        int tempoContribuicao;
        int restante;

        Scanner read = new Scanner(System.in);

        System.out.println("Insira sua idade:");
        idade = read.nextInt();
        System.out.println("Insira seu sexo(m/f):");
        sexo = read.next();
        System.out.println("Insira seu tempo de contribuição:");
        tempoContribuicao = read.nextInt();

        if (sexo.equals("m") && tempoContribuicao >= 35 || idade>=65){
            System.out.println("Você já tem o direito de se aposentar");
        }else if (sexo.equals("f") && tempoContribuicao >= 30 || idade>=60) {
            System.out.println("Você já tem o direito de se aposentar");
        }else if(sexo.equals("m")&& tempoContribuicao<30){
            restante = 35 - tempoContribuicao;
            System.out.println("faltam "+restante+ " anos para você se aposentar");
        }else if(sexo.equals("f") && tempoContribuicao<35){
            restante = 30 - tempoContribuicao;
            System.out.println("faltam "+restante+ " anos para você se aposentar");
        }
    }
}

