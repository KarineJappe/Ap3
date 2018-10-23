package Aula05e06;

public class ExSete {
    public static void main(String[] args) {
        //Uma imagem é formada por pixels. Considere uma imagem com dimensão de 40 x 40
        // e faça uma classe que contenha um array bidimensional com essas dimensões.
        // A seguir, para cada posição desse array bidimensional armazene um valor
        // aleatório entre 0 e 255 (esses valores correspondem às tonalidades aplicadas
        // sobre a imagem). Apresente em tela os 1600 valores gerados.

        int imagem[][]= new int[40][40];

        for (int i=0; i<imagem.length; i++) {
            for (int j = 0; j < imagem.length; j++) {
                imagem[i][j] = (int) (Math.random() * 225);
                System.out.print(imagem[i][j]+ "|");
            }
            System.out.println(" ");
        }
    }
}
