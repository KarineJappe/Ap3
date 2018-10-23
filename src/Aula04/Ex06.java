package Aula04;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        //Crie uma classe que exiba o substring de uma string FRASE composto por todos
        // os caracteres de FRASE exceto o último caracter.

        String frase;
        Scanner read = new Scanner(System.in);

        System.out.println("Frase:");
        frase = read.nextLine();

        String modificada= frase.substring(0, frase.length()- 1);
        System.out.println(modificada);
    }
}
