package com.javaintermediario.estudosEnum;

public class TesteEnum {
    public static void main (String [] args){

        DiaSemanaAvancado dia = DiaSemanaAvancado.SEGUNDA;

        System.out.println(dia.toString() + '-' + dia.getValor());

        Data data = new Data(1,4,2016,DiaSemana.SEXTA);
    }
}
