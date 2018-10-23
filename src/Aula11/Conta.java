package Aula11;

public class Conta {
    private double saldo=0;
    int nConta;
    String senha;
    Cliente titular;


    public boolean deposita(double valor) {
        this.saldo += valor;
        System.out.println("Seu saldo foi atualizado R$ " + saldo);
        return true;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Retire seu dinheiro");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Slado insuficiente!");
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular " + this.titular.nome);
        System.out.println("Saldo em " +"R$ " + this.saldo);
    }
}


