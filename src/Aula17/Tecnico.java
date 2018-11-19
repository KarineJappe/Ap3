package Aula17;

public class Tecnico extends Pessoa {
    public Tecnico() {
        System.out.print("Digite nome:");
        this.setNome(read.next());
        System.out.print("Digite telefone:");
        this.setTelefone(read.next());
        System.out.print("Digite email:");
        this.setEmail(read.next());
    }
}
