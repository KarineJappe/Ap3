package Aula11;

/*Elabore uma classe Conta Corrente, com os seguintes atributos, saldo, numero da conta, senha e titular.
Titular é um atributo composto de uma classe Cliente, os atributos de uma classe cliente é cpf, nome e idade.
Crie métodos que possibilite efetuar um saque, efetuar um depósito e transferir valores de uma conta para outra.*/

public class ContaCorrente {
    public float saldo;
    public int numeroConta;
    public String senha;
    public Cliente titular;



    public boolean sacar(float valor) {

        if(valor > this.saldo) {
            return false;
        }else {
            this.saldo -= valor;
            return true;
        }

    }

    public boolean depositar(float valor) {
        this.saldo += valor;
        return true;
    }

    public String verSaldo() {
        return "Você possui  R$ " + this.saldo;
    }

    public boolean transferir(ContaCorrente destino, float valor) {
        if(this.sacar(valor)) {
            return destino.depositar(valor);
        }else{
            return false;
        }

    }
}
