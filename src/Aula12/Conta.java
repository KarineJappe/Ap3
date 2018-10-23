package Aula12;

import java.util.Objects;

public class Conta {
    private double saldo=0;
    private int nConta;
    private String senha;
    private Cliente titular;
    private double limite=200;


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Cliente getTitular() {
        return titular;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta that = (Conta) o;
        return Objects.equals(titular.getCpf(), this.titular.getCpf());
    }*/

    public boolean equals(Object obj) {
        if (obj instanceof Conta) {
            Conta qualquer = (Conta) obj;
            return this.titular.getCpf().equals(qualquer.titular.getCpf()) || this.titular.getNome().equals(qualquer.titular.getNome());
        }else {
            return false;
        }
    }


    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public double setLimite() {
        if (titular.getIdade() >=60){
            this.limite = 300;
        }
        this.limite = limite;
        return limite;
    }

    public boolean deposita(double valor) {
        if (valor > setLimite()) {
            System.out.println("Limite excedido.");
            return false;
        } else {
            this.saldo += valor;
            System.out.println("Seu saldo foi atualizado R$ " + saldo);
            return true;
        }
    }

    public boolean sacar (double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Retire seu dinheiro");
            return true;
        } else {
            System.out.println("Saldo insuficiente!!");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (sacar (valor)) {
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Titular " + this.titular.getNome());
        System.out.println("Saldo em " +"R$ " + this.getSaldo());
    }
}


