package Aula08;

public class Funcoes {

    public String getMesPorExtenso(int numero, int opcao) {
        String a;
            if (opcao == 1) {
                String vetorpt[] = {"Janeiro", "Fevereiro", "Março", "April", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
                a= vetorpt[numero-1];
            } else if (opcao == 2) {
                String vetor[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "october", "November", "December"};
                 a= vetor[numero-1];
            } else {
                 a= "Deu Pal";
            }
            return a;
    }

}
