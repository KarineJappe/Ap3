package Aula17;

import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa {
    Scanner read = new Scanner(System.in);

    private String nome;
    private String telefone;
    private String Email;
    private String login;
    private String senha;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "read=" + read +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", Email='" + Email + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    //-------------------login
    public static Pessoa validaAcesso(String senha, String login, ArrayList<Pessoa> array){

        Pessoa logado=validaLogin(login,array);
        if (validaLogin(login, array) == validaSenha(senha, array)){
            return logado;
        }
        return null;
    }
    private static Pessoa validaLogin(String login, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getLogin().equals(login)){
                return array.get(i);
            }
        }
        return null;
    }

    private static Pessoa validaSenha(String senha, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getSenha().equals(senha)){
                return array.get(i);
            }
        }
        return null;
    }
}
