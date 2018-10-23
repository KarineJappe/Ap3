package Aula05e06;

import java.util.Scanner;

public class ExQuatro {
    public static void main(String[] args) {
// Escreva um programa que crie um ClasseString e use um laço for para verificar
// se ele é um palíndromo, ou seja, se você inverter a ordem dos caracteres
// do ClasseString, obterá o mesmo ClasseString. Por exemplo, “abcdcba” é um palíndromo.
        String palavra;
        String palavraInvertida ="";
        Scanner read = new Scanner(System.in);

        System.out.println("Informe um palindromo:");
        palavra = read.next();

        for (int i=palavra.length()-1; i>=0; i--){
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        if( palavraInvertida.equals(palavra)){
            System.out.println(palavraInvertida);
        }else{
            System.out.println("Esta palavra não é um palidromo");
        }


    }
}
