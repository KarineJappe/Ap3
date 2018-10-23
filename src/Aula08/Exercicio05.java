package Aula08;

public class Exercicio05 {
//Elabore uma classe chamada “MeusArrays” contendo dois métodos que realizam operações com
//arrays, conforme a descrição a seguir. Faça também outra classe para testar os métodos:
//a. um método que recebe dois arrays de inteiros e um número inteiro. Pesquise se esse número
// inteiro existe nos dois arrays e de um retorno conforme a descrição seguinte: se o número não
// for encontrado em nenhum dos arrays, retorne 0; caso encontre em um dos arrays, retorne 1; e
// casoseja localizado nos dois arrays, retorne 2.
//b. um método que recebe um valor inteiro (n) e retorna um array contendo n elementos inteiros
// gerados randomicamente. Os valores gerados devem estar entre 0 e 1000.

    public static int[] gerar(int tam){
        int[] vetor = new int[tam];
        for(int i = 0; i < tam; i++){
            vetor[i] = (int)(Math.random()*1001);
        }
        return vetor;
    }

    public static int iguais (int[] vetor1, int[] vetor2, int num){
        int ret = 0;
        if(emArray(num, vetor1) || emArray(num, vetor2)){
            ret = 1;
            if(emArray(num, vetor1) && emArray(num, vetor2)){
                ret = 2;
            }
        }
        return ret;
    }

    public static boolean emArray(int num, int[] vetor){
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] valores = {1, 2, 3};
        System.out.println(iguais(valores, valores, 3));
        for (int numeros : gerar(10)) {
            System.out.println(numeros);
        }
    }
}
