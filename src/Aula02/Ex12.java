package Aula02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
       // Faça uma classe que solicite login e senha, simulando o acesso a um
        // sistema. Considere que os conteúdos de login e senha originais são iguais
        // a “java8”. O usuário deverá fornecer login e senha e você irá compará-los
        // com os conteúdos originais. O usuário tem três chances para digitar corretamente
        // os dados de login e senha. Para cada tentativa incorreta deve aparecer uma mensagem
        // alertando o erro e apresentando a quantidade de tentativas que ainda restam.

        String login, senha;
        int cont=3;
        Scanner read = new Scanner(System.in);

        for (int i=1; i<=3;i++){
            System.out.println("Login>");
            login = read.next();
            System.out.println("Senha>");
            senha = read.next();
            if (login.equals("java8") && senha.equals("java8")){
                System.out.println("Acesso permitido");
            }else{
                cont-= 1;
                System.out.println("Login ou senha incorreto, restam "+cont+" tentativa(s)");
            }
        }
    }
}
