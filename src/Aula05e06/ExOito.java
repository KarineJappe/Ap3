package Aula05e06;

public class ExOito {
    public static void main(String[] args) {
        //Faça uma classe contendo dois arrays do tipo inteiro, um chamado par e outro
        // chamado ímpar. Cada array deve conter 10 elementos. A seguir, faça um laço de
        // repetição com 10 iterações e que contenha internamente a geração randômica de
        // números entre 1 e 20. Se o valor gerado for par, armazene no array chamado par,
        // caso contrário, no array chamado impar. Ao  final, apresente o conteúdo de cada
        // um dos arrays.

        int par []= new int[10];
        int impar[]= new int[10];
        String numeroPar = "";
        String numeroImpar= "";

        for (int i=1; i<10; i++){
            int sorteio = (int) (Math.random()*19)+1;
            if (sorteio % 2 == 1){
                impar[i]= sorteio;
                numeroImpar = impar[i]+ " "+ numeroImpar;
            }else {
                par[i]= sorteio;
                numeroPar = par[i]+ " "+ numeroPar;
            }
        }
        System.out.println("Par "+ numeroPar);
        System.out.println("Impar "+ numeroImpar);
    }
}
