package Aula08;

public class Data02 {
    private int dia;
    private int mes;
    private int ano;

    public String recebeData(String data) {
        String[] vetor;
        vetor = data.split("/");
        dia = Integer.parseInt(vetor[0]);
        mes = Integer.parseInt(vetor[1]);
        ano = Integer.parseInt(vetor[2]);
        String a ="";
        if (ano >2018) {
            if(mes==0 || mes >12){
                a = "0";
            }
             if ((dia > 31)&&(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)) {
                 a= "0";
             }
                 if ((dia > 30)&&(mes == 4 || mes == 6 || mes == 9 || mes == 11) ) {
                    a= "0";
                 }
                     if ( (dia > 29)&& (mes == 2)) {
                         System.out.println(a = "0");
                     }
        }else{
            a= data;
        }
        return a;
    }
}