package Aula04;

public class Ex03 {
    public static void main(String[] args) {
       //Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random.
        //Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma
        // quantidade de dígitos correspondentes ao valor aleatório gerado. Apresente em
        // tela o número sorteado e a senha.

        int numero;
        int senha;
        String minhaSenha="";

        numero = (int) (5+ Math.random()*11);
        System.out.println(numero);

        for(int i=1; i<numero; i++){
            senha= (int) (Math.random()*10);
            minhaSenha = minhaSenha+senha;
        }
        System.out.println("senha:  "+ minhaSenha);
    }
}
