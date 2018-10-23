package Aula02;

import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("senha> ");
        String senha = read.nextLine();
        if( senha.equals("1234")){
            System.out.println("Acesso Permitido");
        }else{
            System.out.println("Acesso Negado");
        }
    }
}

