package Aula04;

import java.util.Random;

public class GeradorSenha {
        public static void main(String[] args) {

            //instância um objeto da classe Random usando o construtor padrão
            Random gerador = new Random();

            //imprime sequência de 10 números inteiros aleatórios
            for (int i = 1; i <= 10; i++) {
                System.out.println(gerador.nextInt());
            }
        }
    }

