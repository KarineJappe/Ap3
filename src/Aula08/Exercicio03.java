package Aula08;

import java.util.Scanner;

public class Exercicio03 {
//Crie uma classe chamada Data que contenha os métodos getDia, getMes e getAno. Esses métodos
//recebem uma data em formato texto no padrão “dd/mm/aaaa” e retornam um número inteiro
//correspondente ao dia, mês e ano existentes na data fornecida. Caso a data enviada esteja
//fora do padrão, os métodos, deve retornar o valor zero. Faça também outra classe para testar o método.

    public static int getDia(String data)
    {
        return (Integer.parseInt(data.substring(0,2)));
    }
   public static int getMes(String data){
       return (Integer.parseInt(data.substring(2,4)));
    }
    public static int getAno(String data){
        return (Integer.parseInt(data.substring(4,8)));
    }

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Data02 data=new Data02();
        String resp="";
        System.out.println("Digite uma data:");
        resp=read.nextLine();
        System.out.println(data.recebeData(resp));

/*

        Date oi = null;
        String dataTexto = new String;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            format.setLenient(false);
            oi = format.parse(dataTexto);
        } catch (ParseException e) {
            System.out.println("Data inválida. Tente novamente!");

        }
*/



    }
}