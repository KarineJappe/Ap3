package Aula04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        // Construa uma classe que receba uma frase qualquer e mostre essa frase de
        // trás para a frente e sem espaços em branco.

        String frase;
        String fraseInvertida= "";
        Scanner read = new Scanner(System.in);

        System.out.println("Frase:");
        frase = read.nextLine();
        frase= frase.replace(" ","");
        for(int i=frase.length()-1; i>=0; i--){
            fraseInvertida += frase.charAt(i);

        }
        System.out.println(fraseInvertida);
    }
}
