package Aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        //Elabore uma classe que receba o nome de um produto e o seu valor. O
        //desconto deve ser calculado de acordo com o valor fornecido conforme a
        //imagem. Utilizando a estrutura if-else, apresenta em tela o nome do produto,
        //valor original do produto e o novo valor depois de ser realizado o desconto.
        //Caso o valor digitado seja menor que zero, deve ser emitida uma mensagem
        //de aviso.
        String produto;
        double valor;
        double valorFinal;

        Scanner read = new Scanner(System.in);

        System.out. println ( "Digite o Nome do produto: " );
        produto= read .next();

        System.out. println ( "Digite o valor do Produto:" );
        valor= read .nextDouble();

        System.out. println ( "Nome do Produto: " +produto);
        System.out. println ( "Preço original do Produto R$ " +valor);

        if ((valor>= 50 ) && (valor < 200 )){
            valorFinal= valor - (valor* 5 / 100 );
            System.out. println ( "Valor do Produto com Desconto R$ " + valorFinal);
        }else if ((valor >= 200 ) && (valor < 500 )){
            valorFinal= valor - (valor* 6 / 100 );
            System.out. println ( "Valor do Produto com Desconto R$ " + valorFinal);
        }else if ((valor >= 500 ) && (valor < 1000 )){
            valorFinal= valor - (valor* 7 / 100 );
            System.out. println ( "Valor do Produto com Desconto R$ " + valorFinal);
        }else if (valor >= 1000 ){
            valorFinal= valor - (valor* 8 / 100 );
            System.out. println ( "Valor do Produto com Desconto R$ "
                    + valorFinal);
        }else{
            System.out. println ( "Valor do Produto menor que zero!" );
        }
    }
}
