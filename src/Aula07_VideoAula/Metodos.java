package Aula07_VideoAula;

public class Metodos {
    public static void main(String[] args) {
        //length
        //equals
        //charAt
        //trim
        //toUpperCase
        //replace
        //equalsIgnoreCse
        //contains
        //starsWith
        //endsWith

        String frase = "Java é muito legal";
        System.out.println(frase.length());

        String frase2= "java";
        if(frase.equals(frase2)){
            System.out.println("São a mesmissima coisa");
        }else {
            System.out.println("Não são iguais");
        }
        frase="Java é muito legal";

        System.out.println(frase.charAt(0));
        System.out.println(frase.charAt(5));

        String email = " nome.sobrenome@gmail.com";
        String trim = email.trim();
        email = email.replace("gmail","hotmail");
        System.out.println(trim);
        System.out.println(email);



    }
}
