package com.javaintermediario.estudosWrappers;

//Classes wrappers foram consideradas primitivas e depreciadas desde o java 9
public class TesteWrapper {
    public static void main(String[] args){

       short num1 = 1;
       byte num2 = 10;
       int num3 = 100;
       long num4 = 10000l;
       float num5 = 3.5f;
       double num6 = 3.55555;
       boolean flag = true;
       char a = 'a';

       //You shall use Short.valueOf. This is taken from the javadoc
        Short.valueOf((short) 1); //num7 = new Short((short) 1);
        Byte.valueOf((byte) 10);//Byte num8 = new Byte((byte) 10);
       Integer num9 = Integer.valueOf(100);//Integer num9 = new Integer(100);
       Long.valueOf( 1000l);//Long num10 = new Long(10000l);
       Float.valueOf(3.5f);//Float num11 = new Float(3.5f);
       Double.valueOf(3.5555);//Double num12 = new Double(3.55555);
        Boolean.valueOf(true);//Boolean flag2 = new Boolean(true);
       Character.valueOf('b');//Character b = new Character('b');

       //Integer num13 = new Integer();

        System.out.println(num9);
    }
}
