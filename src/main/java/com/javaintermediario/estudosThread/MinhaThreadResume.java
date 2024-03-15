package com.javaintermediario.estudosThread;

public class MinhaThreadResume implements Runnable {

    private String nome;

    public MinhaThreadResume(){
        this.nome = nome;
        new Thread(this, nome).start();

    }

    @Override
    public void run() {

        System.out.println("Executando " + this.nome);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread " + nome + ", " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + this.nome + " terminada.");

    }
}
