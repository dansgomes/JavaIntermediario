package com.javaintermediario.estudosClassesUtilitarias;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Aula87Calendar {
    public static void main (String[] args){

        Calendar hoje = Calendar.getInstance(); //singleton

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundos = hoje.get(Calendar.SECOND);

        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);
        System.out.println(hora);
        System.out.println(minuto);

        System.out.printf("Hoje é : %d", ano);
        System.out.println();

        System.out.printf("Hoje é : %d/%d", (mes+1), ano);
        System.out.println();

        System.out.printf("Hoje é : %2d/%2d/%d",dia, (mes+1), ano);
        System.out.println();

        hoje.add(Calendar.DAY_OF_MONTH, 1);

        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }
}
