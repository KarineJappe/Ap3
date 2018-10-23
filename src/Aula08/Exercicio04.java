package Aula08;

public class Exercicio04 {
//Crie uma classe chamada Senha que contenha um método chamado gerar que retorna uma senha
// contendo oito caracteres numéricos. Faça também outra classe para testar o método.

    public static void gerarSenha(){
        String minhaSenha="";
        for(int i=0; i<8;i++){
            int senha = (int) (Math.random()*20+1);
            minhaSenha= minhaSenha+senha;
            if (i<7){
                minhaSenha=minhaSenha+"-";
            }
        }
        System.out.println(minhaSenha);
    }

    public static void main(String[] args) {
        gerarSenha();
    }
}
