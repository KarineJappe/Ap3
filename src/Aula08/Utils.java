package Aula08;

import java.util.Scanner;

public class Utils {
    Scanner read = new Scanner(System.in);

    public String stringMsg() {
        System.out.println("Informe uma String:");
        String resposta = read.nextLine();
        return resposta;
    }

    public int intgMsg() {
        System.out.println("Informe uma String:");
        int resposta = read.nextInt();
        return resposta;
    }

    public double doubleMsg() {
        System.out.println("Informe uma String:");
        double resposta = read.nextDouble();
        return resposta;
    }

    public float foatgMsg() {
        System.out.println("Informe uma String:");
        float resposta = read.nextFloat();
        return resposta;
    }

    public String redString(String frase) {
        System.out.println(frase);
        String resposta = read.nextLine();
        return resposta;
    }

    public int readInt(String frase) {
        System.out.println(frase);
        int resposta = read.nextInt();
        return resposta;
    }

    public Double readDouble(String frase) {
        System.out.println("Informe uma String:");
        Double resposta = read.nextDouble();
        return resposta;
    }

    public float readFloat(String frase) {
        System.out.println(frase);
        float resposta = read.nextFloat();
        return resposta;
    }

    public String lerTelefone() {
        System.out.println("Informe um telefone:");
        String telefone = read.nextLine();
        int traco = telefone.indexOf('-');
        int numero = telefone.length();
        String resposta="";
        if (traco == 1) {
            if (numero == 13) {
                resposta=telefone;
            } else {
                resposta= null;
            }
        }
        return resposta;
    }
     public void inverterData (){
         System.out.println("Informe uma data: ");
         String result =read.next();
         String data = result;
         String inverterData[] = data.split("/");

         for (int i =1; i>=0; i--){
             System.out.print(inverterData[i]+"/");
         }
         System.out.print(inverterData[2]);
     }
}
