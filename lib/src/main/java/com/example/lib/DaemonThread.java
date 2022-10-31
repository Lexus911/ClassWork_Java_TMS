package com.example.lib;

public class DaemonThread {
    public static void main(String[] args) {

        ThreadClass7 threadClass7 = new ThreadClass7();
        threadClass7.setDaemon(true);
        threadClass7.start();

    }
}

class ThreadClass7 extends Thread{
    @Override
    public void run() {
        System.out.println("I'm a daemon thread "
                + Thread.currentThread().isDaemon());
    }
}