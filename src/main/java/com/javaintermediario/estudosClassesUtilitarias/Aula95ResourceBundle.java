package com.javaintermediario.estudosClassesUtilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {
    public static void main(String [] args){

        System.out.println("Locale atual " + Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");

        System.out.println("Olá: " + rb.getString("hello"));
        System.out.println("Mundo: " + rb.getString("world"));

        Locale.setDefault(new Locale("pt_br", "pt_Br"));
        rb = ResourceBundle.getBundle("meu=texto");
    }
}
