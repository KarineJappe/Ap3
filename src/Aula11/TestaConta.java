package Aula11;

public class TestaConta {
    public static void main(String[] args) {
        Conta contaJose= new Conta();

        contaJose.deposita(100);
        contaJose.nConta=3906;
        contaJose.senha="12345";
        Cliente jose = new Cliente();
        jose.nome= "joão da Silva Sauro";
        jose.idade=18;
        jose.cpf="023360190-38";

        contaJose.titular=jose;

        Conta contaMaria= new Conta();
        contaJose.deposita(200);
        contaJose.mostrarSaldo();
        contaMaria.nConta=3907;
        contaMaria.senha="321";
        Cliente maria = new Cliente();
        contaMaria.titular=maria;
        maria.nome="Maria Oldina Silveira";
        maria.idade=26;
        maria.cpf="060236350-55";


        contaJose.sacar(1000);
        contaJose.mostrarSaldo();
        contaMaria.mostrarSaldo();

        contaJose.transferir(contaMaria,500);
        contaMaria.mostrarSaldo();
        contaJose.mostrarSaldo();
        contaJose.deposita(1000);
        contaJose.mostrarSaldo();
    }
}