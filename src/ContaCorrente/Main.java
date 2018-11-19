package ContaCorrente;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int resposta;
        Scanner read = new Scanner(System.in);
        ArrayList<ContaCorrente> banco= new ArrayList<>();

        do {
            System.out.println("1-Criar uma nova conta: \n" +
                    "2-Depositar\n" +
                    "3-Sacar\n" +
                    "4-Tranferir\n" +
                    "0-Encerrar programa");
            resposta = read.nextInt();
            switch (resposta){
                case 1:
                    ContaCorrente a =new ContaCorrente();
                    banco.add(a);
                    break;
                case 2:
                    ContaCorrente b = new ContaCorrente();
                    System.out.println("Informe a conta:");
                    int numero = read.nextInt();
                    try {
                        for (ContaCorrente c : banco) {
                            if (numero == c.getNumeroConta()) {
                                b = c;
                            }
                        }
                        System.out.println("Informe o valor:");
                        int valor = read.nextInt();
                        b.depositar(valor);
                    }catch (Exception e){
                        System.out.println("Conta inessitente!");
                    }
            }

        }while (resposta!=0);
        ContaCorrente gabriel= new ContaCorrente();
        ContaCorrente juliana = new ContaCorrente();


        banco.add(gabriel);
        banco.add(0,juliana);
        banco.size();

        if (gabriel.equals(juliana)) {
            System.out.println("Conta já criada");
        } else {
            System.out.println("Nova conta!");
        }

        juliana.depositar(100);
        gabriel.depositar(250);
        juliana.transferir( 30, gabriel);
        juliana.mostrarSaldo();
        System.out.println("----------------------");
        gabriel.mostrarSaldo();
        System.out.println("----------------------");
        System.out.println("Contas:");

        for (ContaCorrente  c: banco) {
            System.out.println(c.getCliente().getNomeTitular());
        }

    }
}
