package com.javaintermediario.estudosThread;

public class Teste5 {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 800);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 1000);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();

        /*try {
            t1.join(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        t2.start();

        /*try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }




        System.out.println("Programa finalizado");
    }
}
