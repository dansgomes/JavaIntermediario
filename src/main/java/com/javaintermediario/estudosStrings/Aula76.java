package com.javaintermediario.estudosStrings;



//Aula sobre concatenação de Strings
public class Aula76 {

    public static void main (String[] args) {

        String curso = "Curso";
        String java = "Java";

        String cursoJava = curso + java;

        System.out.println(cursoJava);

        String resultado2Com2 = "Resultado 2+2 = " + (2+2);
        System.out.println(resultado2Com2);

        String resultado2Com2_ = "Resultado 2+2 = " + 2 + 2;
        System.out.println(resultado2Com2_);

        String um = String.valueOf(1);
        System.out.println(um);

        String concatenacao = "sausahusauhsuah" +
                "kakakakakakakaka" +
                "aaaaaaaaaaaaaaaaaaaaa" +
                "beeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";

        System.out.println(concatenacao);

        String concatenacao2 = "sausahusauhsuah";
        concatenacao2 += "kakakakakakakaka";
        concatenacao2 += "aaaaaaaaaaaaaaaaaaaaa";
        concatenacao2 +=  "beeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";

        System.out.println(concatenacao2);
    }
}
