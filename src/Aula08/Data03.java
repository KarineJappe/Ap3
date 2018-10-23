package Aula08;

import java.util.Scanner;

public class Data03 {
    public static String lerdata() {
        Scanner teclado = new Scanner(System.in);
        String data;
        int dia = 0, mes = 0, ano = 0;
        System.out.println(" digite a data dd/mm/aaaa");
        data = teclado.nextLine();

        String resposta[] = data.split("/");
        dia = Integer.parseInt(resposta[0]);
        mes = Integer.parseInt(resposta[1]);
        ano = Integer.parseInt(resposta[2]);

        if (ano<=2018){
            if ((dia<=31) && (mes == 1 || mes ==3 || mes ==5 || mes == 7 || mes ==10  || mes== 12)) {
                return data;
            }
            if ((dia<=30) && (mes ==4 || mes == 6|| mes== 11) ) {
                return data;
            }
            if ((dia<=28) && (mes==2))
                return data;
            if (ano%4==0 && dia==29 && mes==2)
                return data;
        }
        else {
            return null;
        }
        return data;
    }

    public static void main(String[] args) {
        lerdata();
    }

}
