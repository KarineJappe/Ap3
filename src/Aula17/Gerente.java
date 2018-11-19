package Aula17;

import java.util.ArrayList;

public class Gerente extends Pessoa {

    // CrudZÃO
    public Gerente(){
        super();
        System.out.println("Gerente criado!");
    }
    public Cliente cadastrarCliente(){
        Cliente cliente = new Cliente();
        return cliente;
    }
    public Tecnico cadastrarTecnico(){
        Tecnico tecnico = new Tecnico();
        return tecnico;
    }

    public void listarCliente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getNome().equalsIgnoreCase(nome)) {
                if (array.get(i) instanceof Cliente) {
                    System.out.println(array.get(i).toString());
                }
            } else {
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void listarTecnico(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Tecnico) {
                    System.out.println(array.get(i).toString());
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void listarGerente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Gerente) {
                    System.out.println(array.get(i).toString());
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }

    public void editarCliente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Cliente){
                    menuEdicao();
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void editarTecnico(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Tecnico){
                    menuEdicao();
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }
    public void editarGerente(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                if (array.get(i) instanceof Gerente){
                    menuEdicao();
                }
            }else{
                System.out.println("Nome não encontrado.");
            }
        }
    }

    private void menuEdicao(){
        String resposta;

        System.out.println("1- Editar nome");
        System.out.println("2- Editar telefone");
        System.out.println("3- Editar e-mail");
        System.out.println("4- Editar login");
        System.out.println("5- Editar senha");
        resposta = read.next();

        switch (resposta){
            case ("1"):
                System.out.println("Novo nome: ");
                this.setNome(read.next());
                System.out.println("Nome alterado!");
                break;

            case ("2"):
                System.out.println("Novo telefone: ");
                this.setTelefone(read.next());
                System.out.println("Telefone alterado!");
                break;

            case ("3"):
                System.out.println("Novo e-mail: ");
                this.setEmail(read.next());
                System.out.println("E-mail alterado!");
                break;

            case ("4"):
                System.out.println("Novo login: ");
                this.setLogin(read.next());
                System.out.println("Login alterado!");
                break;

            case ("5"):
                System.out.println("Nova senha: ");
                this.setSenha(read.next());
                System.out.println("Senha alterada!");
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }

    public boolean remover(String nome, ArrayList<Pessoa> array){
        for (int i = 0; i < array.size(); i++){
            if (array.get(i).getNome().equalsIgnoreCase(nome)){
                array.remove(i);
                return true;
            }else{
                System.out.println("Nome não encontrado.");
                return false;
            }
        }
        return false;
    }



}

