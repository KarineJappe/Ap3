/*
package Aula08;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public String recebeData(String data) {
        String[] vetor;
        vetor = data.split("/");
        dia = Integer.parseInt(vetor[0]);
        mes = Integer.parseInt(vetor[1]);
        ano = Integer.parseInt(vetor[2]);
        System.out.println(data);

        if (ano > 0 && ano >= 2018) {
            return "0"; //fazer varios if pro falso sem o else e no final se não entrar nenhum return o colocar o else que retorna a dta inteira.
            switch (mes) {
                case 1: case 3: case 5: case 7:
                    if (dia > 31) {
                        return "0";
                    }
                    break;
                case 2:
                    //Mês de fevereiro
                    if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
                        if (dia > 29) {
                            return "0";
                        }
                    break;

                case 4: case 6:
                    if (dia > 30) {
                        return "0";
                        break;
                    }
                    if (mes < 0 && mes > 12) {
                        return "0";
                    }
            }
        }else{
            return data;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}*/
