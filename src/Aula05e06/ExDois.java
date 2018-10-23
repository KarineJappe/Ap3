package Aula05e06;

public class ExDois {
    public static void main(String[] args) {
        // Já que todos os strings são objetos de tipo ClasseString, mostre como chamar os
        // métodos length( ) e charAt( ) neste literal de string: “I like Java”.

        String frase[]= new String[2];

        for (int i=0; i<frase.length; i++) {
            frase[i]= "I love Java";
        }
        for(int k=7; k < frase[1].length(); k++ ){
            System.out.print(frase[1].charAt(k));

        }
    }
}
