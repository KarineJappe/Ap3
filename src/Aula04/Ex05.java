package Aula04;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
// Elabore uma classe que receba uma frase e verique que se essa frase possui
// palavras impróprias. As palavras impróprias são: sexo e sexual. Caso encontre uma
// dessas palavras, emita em tela a mensagem “conteúdo impróprio”, caso contrário
// “conteúdo liberado”.

        String frase;
        Scanner read = new Scanner(System.in);

        System.out.println("Frase:");
        frase = read.nextLine();
        if( frase.contains("sexo") || frase.contains("sexual")){
            System.out.println("Conteúdo impróprio");
        }else{
            System.out.println("conteúdo liberado");
            System.out.println(frase);
        }
    }
}
