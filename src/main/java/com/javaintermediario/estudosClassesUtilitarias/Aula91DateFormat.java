package com.javaintermediario.estudosClassesUtilitarias;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {
    public static void main(String[]args){

        Date hoje = new Date();

        System.out.println(Locale.getDefault());

        Locale.setDefault(new Locale("pt", "Brazil"));

        String hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getTimeInstance(DateFormat.LONG).format(hoje);
        System.out.println(hojeFormatado);

        hojeFormatado = DateFormat.getDateTimeInstance(
                DateFormat.MEDIUM, DateFormat.SHORT).format(hoje);
        System.out.println(hojeFormatado);

        String data = "16-02-2024 17:54";
        try {
            Date dataDate = DateFormat.getDateInstance().parse(data);
            System.out.println(dataDate);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(dataDate);

            System.out.println(calendario);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
