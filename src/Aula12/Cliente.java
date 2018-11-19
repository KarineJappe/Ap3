package Aula12;

import java.util.Objects;
import java.util.Scanner;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(cpf, cliente.cpf);
    }

    public void ler() {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite NOME");
        this.setNome(tc.next());
        System.out.println("Digite IDADE");
        this.setIdade(tc.nextInt());
        System.out.println("Digite CPF");
        this.setCpf(tc.next());
        }


    @Override
    public String toString() {
        return "Cliente -" +
                "CPF='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '-';
    }
}
