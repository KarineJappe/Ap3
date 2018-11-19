package Aula17;

import java.util.Scanner;

public class Chamados {
    Scanner read = new Scanner(System.in);

    String prioridade;
    String problema;
    int id;


    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
