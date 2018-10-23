package Aula02;

import java.util.Scanner;

public class Ex2_FEA {
    public static void main(String[] args) {
        String senha="1234";
        int senhaInt=1234;
        int senhaIntInformada;
        String senhaInformada;
        Scanner teclado = new Scanner(System.in);

        // do é como o repita -- repetição indeterminada
        do{
            System.out.println("Digite a senha");
            senhaInformada=teclado.next();
            if (!senhaInformada.equals(senha)){
                System.out.println("Acesso negado");
            }
        }while (!senhaInformada.equals(senha));
        System.out.println("Acesso Permitido");


        do{
            System.out.println("Digite a senha INT");
            senhaIntInformada=teclado.nextInt();
            if (!senhaInformada.equals(senha)){
                System.out.println("Acesso negado");
            }
        }while (senhaInt!=senhaIntInformada);
        System.out.println("Acesso Permitido");
        // "String1"."String2"
    }
}
