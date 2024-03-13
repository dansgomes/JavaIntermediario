package com.javaintermediario.estudosThread;

public class TicTac {

    boolean tic;

    synchronized void tic(boolean estáExecutando) {

        if (!estáExecutando) {
            tic = true;
            //notify();
            return;
        }

        System.out.print("Tic");

        tic = true;

        //notify();

        try {
            while (tic) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    synchronized void tac(boolean estáExecutando) {

        if (!estáExecutando) {
            tic = false;
            notify();
            return;
        }

        System.out.println("Tac");

        tic = false;

        notify();

        try {
            while (!tic) {
                wait();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
