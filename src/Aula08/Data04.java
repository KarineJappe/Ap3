package Aula08;

import java.util.Scanner;

public class Data04 {
    public static String lerdata() {
        Scanner teclado = new Scanner(System.in);
        String data;
        System.out.println(" digite a data dd/mm/aaaa");
        data = teclado.nextLine();

        String resposta[] = data.split("/");
        int dia = Integer.parseInt(resposta[0]);
        String mes = resposta[1];
        int ano = Integer.parseInt(resposta[2]);

        if (ano <= 2018) {
            if (dia >= 1 && dia <= 31) {
                if (mes.equals("01") || mes.equals("03") || mes.equals("05")
                        || mes.equals("07") || mes.equals("8") || mes.equals("10") || mes.equals("12")) {
                    return data;
                }
            }

            if (dia >= 1 && dia <= 30) {
                if (mes.equals("04") || mes.equals("06") || mes.equals("09") || mes.equals("11")) {
                    return data;
                }
            }
            if (dia >= 1 && dia <= 28) {
                if (mes.equals("02")) {
                    return data;
                }
            }
            if (ano % 4 == 0) {
                if (dia == 29) {
                    if (mes.equals("02")) {
                        return data;
                    }
                }
            }
        }
            return "0";
    }

    public static void main(String[] args) {
        System.out.println(lerdata());
    }
}

