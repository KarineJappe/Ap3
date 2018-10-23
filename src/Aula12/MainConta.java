package Aula12;

public class MainConta {
    public static void main(String[] args) {
        Conta contaCamily = new Conta();
        Cliente camily = new Cliente();
        camily.setNome("Camily Almeida");
        camily.setIdade(38);
        camily.setCpf("02338024033");
        contaCamily.setTitular(camily);

        contaCamily.setnConta(456);
        contaCamily.setSenha("1a2s3d4f");

        Conta contaCassio = new Conta();
        Cliente cassio = new Cliente();
        cassio.setNome("Cássio Luciano da Rosa");
        cassio.setIdade(62);
        cassio.setCpf("02956014036");
        contaCassio.setTitular(cassio);
        System.out.println(camily.getNome());
        System.out.println(cassio.getNome());

        if (contaCassio.equals(contaCamily)) {
            System.out.println("Conta já criada");
        } else {
            System.out.println("Nova conta");
            contaCassio.setnConta(123);
            contaCassio.setSenha("1q2w3e4e");
        }

        contaCamily.deposita(100);
        contaCassio.deposita(250);
        contaCamily.transferir(contaCassio, 30);
        contaCamily.mostrarSaldo();
        contaCassio.mostrarSaldo();
        
    }
}
