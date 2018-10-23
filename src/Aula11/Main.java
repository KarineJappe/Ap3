package Aula11;

public class Main {
    public static void main(String[] args) {

      /*  for (int i = 0; i < 100; i++) {
            Livro l1 = new Livro();
            l1.lerDados();
            l1.mostrarLivro();
        }*/

        ContaCorrente conta= new ContaCorrente();
        conta.senha="1q2w3e";
        Cliente cliente= new Cliente();
        conta.titular=cliente;
        conta.saldo=100;
        conta.numeroConta=11;

        ContaCorrente conta02= new ContaCorrente();
        conta02.senha="1q2w3e";
        Cliente cliente2= new Cliente();
        conta02.titular=cliente2;
        conta02.saldo=100;
        conta02.numeroConta =12;
    }

}

