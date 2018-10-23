package Aula05e06;

public class ExUm {
    public static void main(String[] args) {
       // Escreva um programa que crie um array de inteiros data e use um laço for para
        // criar um novo ClasseString que exiba o conteúdo do array data entre chaves e separado
        // por vírgulas. Por exemplo, se o array data tiver tamanho 4 e armazenar os
        // valores 3, 4, 1, 5, o ClasseString “{3, 4, 1, 5}” deve ser criado e exibido.

        int data[] = new int[5];
        String exiba ="";

        for(int i=0; i<(data.length); i++){
            data[i]=i;
            exiba = exiba + data[i];
            if (i<4) {
                exiba=exiba+ ",";
            }
        }
        System.out.println("O ClasseString ["+exiba+"]");
    }
}
