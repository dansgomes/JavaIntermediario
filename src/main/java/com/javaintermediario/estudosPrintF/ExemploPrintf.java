package com.javaintermediario.estudosPrintF;

public class ExemploPrintf {

    public static void main(String[] args){

        System.out.printf("Hello %s", "Olá, Mundo!"); // retorna a String (sem pular linha)
        System.out.println();
        System.out.printf("%S", "Olá, Mundo!"); // retorna a mesma String mas em caixa alta
        System.out.println();

        System.out.printf("Hello %c", 'c'); // retorna um caractere
        System.out.println();
        System.out.printf("Hello %C", 'c'); // retorna o caractere em caixa alta

        System.out.printf("%n"); // pula linha (boa prática)

        int valor = 123456789;
        System.out.printf("%d", valor); //output de um inteiro

        System.out.println();

        double pontoFlutuante = 3.147289;
        System.out.printf("%f", pontoFlutuante); //output de ponto flutuante

        System.out.println();

        String olaMundo = "Olá Mundo!";
        System.out.printf("%20s", olaMundo);

        System.out.println();

        System.out.printf("%-20s", olaMundo);

        System.out.println();

        System.out.printf("%20s", olaMundo);

        System.out.println();

        System.out.printf("%+d", valor);

        System.out.println();

        System.out.printf("%015d", valor);

        System.out.println();

        System.out.printf("%,d", valor);

        System.out.println();

        int valor2 = -123456789;
        System.out.printf("% d", valor2);

        System.out.println();
        System.out.printf("% d", valor);

        System.out.println();

        System.out.printf("R$%10.2f", pontoFlutuante);

        testeMaisCompleto();
    }

    private static void testeMaisCompleto(){

        double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};

        for (int i=0; i< precos.length; i++){
            System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
        }

        //Java.util.Formater
    }
}
