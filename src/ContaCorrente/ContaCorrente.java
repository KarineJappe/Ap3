package ContaCorrente;

import java.util.Scanner;

public class ContaCorrente {
        private int agenciaConta;
        private int numeroConta;
        private Double saldoConta;
        private int limiteConta;
        private Cliente cliente;
        public static int idConta =1;

      /*  public ContaCorrente(){
        }
        public ContaCorrente(Cliente titular) {
            this.setLimiteConta(100);
            if (this.cliente.getCpfTitular().equals(titular.getCpfTitular())) {
                System.out.println("CPF já cadastrado!");
            }
        }*/

    public  ContaCorrente(){
        Scanner tc = new Scanner(System.in);
        this.setNumeroConta(this.idConta++);
        System.out.println("Digite o saldo inicial:");
        this.setSaldoConta(tc.nextDouble());
        Cliente titular= new Cliente();
        this.setCliente(titular);
        if(this.getCliente().getIdadeTitular()>60){
            this.setLimiteConta(1000);
        }else{
            this.setLimiteConta(100);
        }
    }

    public boolean equals(Object obj) {
            if (obj instanceof ContaCorrente) {
                ContaCorrente qualquer = (ContaCorrente) obj;
                return this.cliente.getCpfTitular().equals(qualquer.cliente.getCpfTitular()) ||
                        this.cliente.getNomeTitular().equals(qualquer.cliente.getNomeTitular());
            } else {
                return false;
            }
        }

     /*   @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ContaCorrente that = (ContaCorrente) o;
            return Objects.equals(cliente, that.cliente);
        }*/


        public boolean sacar(int valor) {
            if (this.getSaldoConta() >= valor){
                setSaldoConta(getSaldoConta() - valor);
                System.out.println("Retire seu dinheiro");
                return true;
            }else{
                System.out.println("Saldo insuficiente!!");
                return false;
            }
        }

        public boolean depositar(int valor) {//valor minimo de dez pila
            if (valor > 10) {
                setSaldoConta(getSaldoConta() + valor);
                return true;
            }else {
                System.out.println("Saldo insuficiente!!");
                return false;
            }
        }

        public boolean transferir(int valor, ContaCorrente conta) {//valor minimo de dez pila
            if (valor > 10){
                if (this.getSaldoConta() >= valor){
                    this.setSaldoConta(getSaldoConta() - valor);
                    conta.setSaldoConta(conta.getSaldoConta() + valor);
                    return true;
                }
            }
            System.out.println("Saldo insuficiente!");
            return false;
        }

    public void mostrarSaldo() {
        System.out.println("Titular " + this.cliente.getNomeTitular());
        System.out.println("Saldo em R$ " + this.getSaldoConta());
        System.out.println("Número da conta " + this.getNumeroConta());
    }
        public void extrato() {
            System.out.println("Titular " + this.cliente.getNomeTitular());
            System.out.println("Saldo em R$ " + this.getSaldoConta() + this.getLimiteConta());
        }

        public int getAgenciaConta() {
            return agenciaConta;
        }

        public void setAgenciaConta(int agenciaConta) {
            this.agenciaConta = agenciaConta;
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public void setNumeroConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }

        public double getSaldoConta() {
            return saldoConta;
        }

        public void setSaldoConta(double saldoConta) {
            this.saldoConta = saldoConta;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public int getLimiteConta() {
            return limiteConta;
        }

        public void setLimiteConta(int limiteConta) {
            this.limiteConta = limiteConta;
        }
    }

