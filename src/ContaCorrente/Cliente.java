package ContaCorrente;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    private String nomeTitular;
    private int idadeTitular;
    private String cpfTitular;
    private String nascimentoTitular;
    Scanner read = new Scanner(System.in);

    public Cliente() {
        do {
            System.out.println("Idade: ");
            setIdadeTitular(read.nextInt());
            if (this.idadeTitular < 16) {
                System.out.println("Proíbido criar conta para menores de 16 anos. :(");
            }
        } while (this.idadeTitular < 16);

        System.out.println("Nome do titular: ");
        setNomeTitular(read.next());
        do {
            System.out.println("Data de nascimento: ");
            setNascimentoTitular(read.next());
            if (!lerData(this.getNascimentoTitular())){
                System.out.println("Digite uma data válida!");
            }
        }while (!lerData(this.getNascimentoTitular()));

        do {
            System.out.println("CPF do titular: ");
            setCpfTitular(read.next());
            if (!validaCPF(this.getCpfTitular())) {
                System.out.println("Digite um CPF válido!");
            }
        } while (!validaCPF(this.getCpfTitular()));
    }

    public static boolean validaCPF(String cpf) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") ||
                cpf.equals("11111111111") ||
                cpf.equals("22222222222") || cpf.equals("33333333333") ||
                cpf.equals("44444444444") || cpf.equals("55555555555") ||
                cpf.equals("66666666666") || cpf.equals("77777777777") ||
                cpf.equals("88888888888") || cpf.equals("99999999999") ||
                (cpf.length() != 11))
            return (false);

        char dig10, dig11;
        int sm, i, r, num, peso;

        // "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
            // Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero:
                // por exemplo, transforma o caractere '0' no inteiro 0
                // (48 eh a posicao de '0' na tabela ASCII)
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig10 = '0';
            else dig10 = (char) (r + 48); // converte no respectivo caractere numerico

            // Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (cpf.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11))
                dig11 = '0';
            else dig11 = (char) (r + 48);

            // Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10)))
                return (true);
            else return (false);
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getIdadeTitular() {
        return idadeTitular;
    }

    public void setIdadeTitular(int idadeTitular) {
        this.idadeTitular = idadeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public void setCpfTitular(String cpfTitular) {
        this.cpfTitular = cpfTitular;
    }

    public String getNascimentoTitular() {
        return nascimentoTitular;
    }

    public void setNascimentoTitular(String nascimentoTitular) {
        this.nascimentoTitular = nascimentoTitular;
    }

    public boolean lerData(String data) {
       try {
           String temporaria[] = data.split("/");
           int dia = Integer.parseInt(temporaria[0]);
           String mes = temporaria[1];
           int ano = Integer.parseInt(temporaria[2]);

           if (ano <= 2018) {

               if (dia >= 0 && dia <= 31) {

                   if (mes.equals("01") || mes.equals("03") || mes.equals("05") || mes.equals("07") || mes.equals("08") || mes.equals("10")
                           || mes.equals("12 ")) {
                       return true;
                   }
               }

               if (dia >= 0 && dia <= 30) {

                   if (mes.equals("04") || mes.equals("06") || mes.equals("09") || mes.equals("11")) {
                       return true;
                   }
               }

               if (dia >= 0 && dia <= 28) {
                   if (mes.equals("02")) {
                       return true;
                   }
               }

               if (ano % 4 == 0) {
                   if (dia == 29) {
                       if (mes.equals("02")) {
                           return true;
                       }
                   }
               }
           }
           return false;
       }catch (Exception e){
           return false;
       }
    }
}


