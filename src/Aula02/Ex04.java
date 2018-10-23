package Aula02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        Scanner teclado= new Scanner(System.in);
        int num;
        System.out.println("Digite o número");
        num=teclado.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println((i + "x"+num+"="+ i*num));
        }

    }
}
