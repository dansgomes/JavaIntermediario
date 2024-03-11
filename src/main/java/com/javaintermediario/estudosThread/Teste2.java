package com.javaintermediario.estudosThread;

public class Teste2 {

    public static void main( String [] args){

        MinhaThreadRunnable thread = new MinhaThreadRunnable("Thread #1", 500);
        //Thread t1 = new Thread(thread);
        //t1.start();

        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("Thread #2", 800);

        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("Thread #3", 1300);


    }
}
