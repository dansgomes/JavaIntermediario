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
        System.out.printf("%d", valor);

    }
}
