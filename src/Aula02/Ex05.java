package Aula02;

public class Ex05 {
    public static void main(String args[]) {
        double anacleto = 1.5;
        double felisberto = 1.1;
        int contador = 0;
        while ( anacleto > felisberto)
        {
            anacleto += 0.02;
            felisberto += 0.03;
            contador ++;
        }
        System.out.println("Se Anacleto crescer 2cm por ano e " +
                "Felisberto 3cm, tendo eles 1,5 m e 1,1 m respectivamente,");
        System.out.println ("será preciso "+contador+" anos para Felisberto ficar " +
                "maior que Anacleto!");
    }
}

