package Aula02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
       // Na área da eletrônica, em um circuito em série temos que a resistência
        // equivalente (total) desse circuito é obtida mediante a soma de todas
        // as resistências existentes (RE = r1 + r2 + ... + rn). Faça uma classe
        // que receba o valor de quatro resistências ligadas em série, calcule e
        // mostre a resistência equivalente, a maior e a menor resistência.
        int r1;
        int re=0, maior=0, menor=0;

        Scanner read = new Scanner(System.in);


        for ( int i=1; i<=4;i++ ){
            System.out.println("Informe o valor da resistência:");
            r1 = read.nextInt();
            re+=r1;
            if (i==1){
              menor = r1;
            }if(r1>maior){
                maior=r1;
            }if (r1<menor){
                menor=r1;
            }
        }
        System.out.println("Resistência equivalente: "+re);
        System.out.println("maior "+maior);
        System.out.println("menor "+menor);

    }
}
