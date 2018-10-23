package Aula08;

public class Exercicio02 {
// Crie uma classe chamada Contagem que contenha quatro métodos com o nome “contar” utilizando o
// conceito da sobrecarga. A assinatura e função de cada método aparecem descritas na tabela a seguir.
// Faça também outra classe para testar o método.

    public static void contar(){
        for(int i=0; i<10; i++) {
            System.out.println(i+1);
        }
    }
    public static void contar( int fim){
        for(int i=0; i<fim; i++){
            System.out.println(i + 1);
        }
    }
    public static void contar(int inicio, int fim){
        for (int i = inicio; i<fim; i++){
            System.out.println(i);
        }
    }
    public static void contar (int inicio, int fim, int pausa){
        for(int i = inicio; i<=fim; i++){
            try{
                System.out.println(i);
                Thread.sleep(pausa*1000);
            }catch (InterruptedException e){
                System.out.println("Deu pal");
            }
        }
    }
    public static void main(String[] args) {
        contar();
        contar(20);
        contar(10,15);
        contar(10,20,3);

    }
}
