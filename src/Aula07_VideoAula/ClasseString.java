package Aula07_VideoAula;

public class ClasseString {
    public static void main(String[] args) {
        String palavra="java";
        String outrPalavra="JAVA";
        if (palavra.equalsIgnoreCase(outrPalavra)){
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        String frase="Java é muito legal";
        if (frase.contains("legal")) {
            System.out.println("Isso é verdade");
        }else{
        System.out.println("Isso é mentira");
        }
    }
}