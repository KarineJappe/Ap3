package Aula05e06;

public class ExSeis {
    public static void main(String[] args) {
       // Crie uma classe que armazena os 12 meses do ano em um array.
        // A seguir, gere um valor randômico entre 0 e 11 e apresente o mês
        // correspondente ao valor sorteado. Considere que o valor 0 corresponde
        // ao mês de janeiro e o valor 11, ao mês de dezembro.

         String meses[]=new String[12];
         int sorteio;

        meses[0]="Janeiro";
        meses[1]="Fevereiro";
        meses[2]="Março";
        meses[3]="Abril";
        meses[4]="Maio";
        meses[5]="Junho";
        meses[6]="Julho";
        meses[7]="Agosto";
        meses[8]="Setembro";
        meses[9]="Outubro";
        meses[10]="Novembro";
        meses[11]="Dezembro";

        sorteio = (int) (Math.random()*meses.length);

        System.out.println(meses[sorteio]);


    }
}
