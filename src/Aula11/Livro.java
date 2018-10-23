package Aula11;

import java.util.Scanner;

public class Livro {
   public String titulo;
   public int paginas;
   public String isbn;
   public double preco;

   ///métodos

    public void lerDados() {
       Scanner tc = new Scanner(System.in);
       System.out.println("Digite titulo:");
       this.titulo = tc.next();
       System.out.println("Digite páginas:");
       System.out.println("Digite isbn:");
       System.out.println("Digite preço:");
       ///....
    }
       public void mostrarLivro(){
          System.out.println("-------------------");
          System.out.println("Título"+this.titulo);

    }

}
