package Aula17;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            String senha, login;
            boolean foi;
            Scanner read = new Scanner(System.in);
            ArrayList<Pessoa> pessoa = new ArrayList<>();

            if(pessoa.isEmpty()){
                Gerente admin = new Gerente();
                pessoa.add(admin);
            }

            do {
                System.out.println("Login de acesso: ");
                senha = read.next();
                System.out.println("Senha de acesso: ");
                login = read.next();

                if (Pessoa.validaAcesso(senha, login, pessoa)!=null) {
                    System.out.println("Acesso permitido!");
                    foi = true;
                   if (Pessoa.validaAcesso(senha, login, pessoa) instanceof Cliente){

                   }

                } else {
                    System.out.println("Acesso negado!");
                    foi = false;
                }

            }while (foi != true);
      }
}


