package com.javaintermediario.estudosEnum;

public class TesteValue {
    public static void main(String [] args){

        DiaSemanaAvancado[] dias = DiaSemanaAvancado.values();

        for (int i=0; i< dias.length; i++){
            System.out.println(dias[i]);
        }

        for (DiaSemanaAvancado dia : DiaSemanaAvancado.values()){
            System.out.println(dia);
        }


    }
}
