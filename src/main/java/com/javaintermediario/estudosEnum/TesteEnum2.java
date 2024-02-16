package com.javaintermediario.estudosEnum;

public class TesteEnum2 {
    public static void main (String[] args){

        System.out.println(Enum.valueOf(DiaSemanaAvancado.class, "DOMINGO" ));


        DiaSemanaAvancado dia = Enum.valueOf(DiaSemanaAvancado.class, "DOMINGO");

        System.out.println(dia);
    }
}
