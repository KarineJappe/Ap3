package Aula08;

public class Main {
    public static void main(String[] args) {
        Utils funcao=new Utils();

       String frase= funcao.redString("Informe uma frase:");
        System.out.println(frase);

        String frase2 = funcao.stringMsg();

        funcao.inverterData();
    }
}
