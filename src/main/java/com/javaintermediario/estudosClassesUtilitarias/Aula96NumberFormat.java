package com.javaintermediario.estudosClassesUtilitarias;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {

    public static void main(String[] args) throws ParseException {

        //1.000,00 - Brasil
        //1,000.00 - EUA

        Locale en = new Locale("en", "United States");
        NumberFormat nf = NumberFormat.getInstance(en);

        String num = nf.format(100.99);
        System.out.println(num);

        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println(num);

        //MOEDA

        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());

        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        //PORCENTAGEM

        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.986);
        System.out.println(porcentagem);

        porcent.setMaximumIntegerDigits(5);
        porcent.setMinimumIntegerDigits(2);

        porcent.setMaximumIntegerDigits(2);
        porcent.setMaximumFractionDigits(1);

        porcentagem = porcent.format(99.924);
        System.out.println(porcentagem);

        //ARREDONDAMENTO

        nf = NumberFormat.getInstance();
        nf.setRoundingMode(RoundingMode.HALF_DOWN);
        nf.setMinimumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.3));

        Number num3 = nf.parse("199.99");
        System.out.println(num3.intValue());
    }
}
