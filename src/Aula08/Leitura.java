package Aula08;

import java.util.Scanner;

    public class Leitura {

        Scanner read = new Scanner(System.in);

        public int lerInteiro() {
            System.out.println("Digite um valor do tipo inteiro: ");
            int tipoInteiro = read.nextInt();
            return tipoInteiro;
        }

        public int lerInteiroMsg(String frase) {
            System.out.println(frase);
            int tipoInteiro = read.nextInt();
            return tipoInteiro;
        }

        public float lerFloat() {
            System.out.println("Digite um valor do tipo float: ");
            float tipoFloat = read.nextFloat();
            return tipoFloat;
        }

        public float lerFloatMsg(String frase) {
            System.out.println(frase);
            float tipoFloat = read.nextFloat();
            return tipoFloat;
        }

        public double lerDouble() {
            System.out.println("Digite um valor do tipo double: ");
            double tipoDouble = read.nextDouble();
            return tipoDouble;
        }

        public double lerDoubleMsg(String frase) {
            System.out.println(frase);
            double tipoDouble = read.nextDouble();
            return tipoDouble;
        }

        public char lerChar() {
            System.out.println("Digite um valor do tipo char: ");
            char tipoChar = read.next().charAt(0);
            return tipoChar;
        }

        public char lerChar(String frase) {
            System.out.println(frase);
            char tipoChar = read.next().charAt(0);
            return tipoChar;
        }

        public String lerString() {
            System.out.println("Digite um valor do tipo string: ");
            String tipoString = read.next();
            return tipoString;
        }

        public String lerString(String frase) {
            System.out.println(frase);
            String tipoString = read.next();
            return tipoString;
        }

        public String lerEmail(String email) {
            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    return email;
                }
            }
            return null;
        }

        public String lerTelefone(String telefone) {
            char validaHifen = telefone.charAt(3);
            String validaTelefone = telefone.substring(4);
            String validaDDD = telefone.substring(0, 2);

            if (validaTelefone.length() == 8 && validaDDD.length() == 2 && validaHifen == '-') {
                return telefone;
            } else {
                return null;
            }
        }

        public String lerData(String data) {
            System.out.println("Digite uma data no formato dd/mm/aaaa: ");
            data = read.next();

            String temporaria[] = data.split("/");
            int dia = Integer.parseInt(temporaria[0]);
            String mes = temporaria[1];
            int ano = Integer.parseInt(temporaria[2]);

            if (ano <= 2018) {

                if (dia >= 0 && dia <= 31) {

                    if (mes.equals("01") || mes.equals("03") || mes.equals("05") || mes.equals("07") || mes.equals("10")
                            || mes.equals("12")) {
                        return data;
                    }
                }

                if (dia >= 0 && dia <= 30){

                    if (mes.equals("04") || mes.equals("06") || mes.equals("11")){
                        return data;
                    }
                }

                if (dia >= 0 && dia <= 28){
                    if (mes.equals("02")){
                        return data;
                    }
                }

                if (ano % 4 == 0){
                    if (dia == 29){
                        if (mes.equals("02")){
                            return data;
                        }
                    }
                }
            }
            return null;
        }

        public String inverterData(String data) {

            String temporaria[] = data.split("/");
            int dia = Integer.parseInt(temporaria[0]);
            String mes = temporaria[1];
            int ano = Integer.parseInt(temporaria[2]);

            String dataInvertida = "";

            if (ano <= 2018) {

                if (dia >= 0 && dia <= 31) {

                    if (mes.equals("01") || mes.equals("03") || mes.equals("05") || mes.equals("07") || mes.equals("10")
                            || mes.equals("12")) {
                        dataInvertida = ano + "/" + dia + "/" + mes;
                    }
                }

                if (dia >= 0 && dia <= 30){

                    if (mes.equals("04") || mes.equals("06") || mes.equals("11")){
                        dataInvertida = ano + "/" + dia + "/" + mes;
                    }
                }

                if (dia >= 0 && dia <= 28){

                    if (mes.equals("02")){
                        dataInvertida = ano + "/" + dia + "/" + mes;
                    }
                }

                if (ano % 4 == 0){

                    if (dia == 29){

                        if (mes.equals("02")){
                            dataInvertida = ano + "/" + dia + "/" + mes;
                        }
                    }
                }
            }

            return dataInvertida;
        }

        public int verificaNumero(String dado) {

            try {
                int numero = Integer.parseInt(dado);
                return numero;

            } catch (NumberFormatException ex) {
                System.out.println("Digite um número válido!");
            }
            return 0;
        }

        public static void main(String[] args) {

            Leitura leitura = new Leitura();

            leitura.lerInteiro();
            leitura.lerInteiroMsg("Digite um valor inteiro: ");

            leitura.lerFloat();
            leitura.lerFloatMsg("Digite um valor float: ");

            leitura.lerDouble();
            leitura.lerDoubleMsg("Digite um valor double: ");

            leitura.lerChar();
            leitura.lerChar("Digite um valor char: ");

            leitura.lerString();
            leitura.lerString("Digite um valor string: ");

            leitura.lerEmail("viceents@gmail.com");

            leitura.lerTelefone("054-996492089");

            leitura.lerData("20/03/1995");

            leitura.inverterData("20/03/1995");

            leitura.verificaNumero("123456789");

        }
    }


