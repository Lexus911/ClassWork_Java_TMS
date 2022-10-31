package com.example.lib;

public class Synchronized_method {
    public static void main(String[] args) {
        CountThread1 countThread1 = new CountThread1();
        Thread thread3 = new Thread(countThread1);
        thread3.start();
        Thread thread4 = new Thread(countThread1);
        thread4.start();
    }
}

class CountThread1 implements Runnable{
private int count = 0;
//2 способ синхронизации через synchronized метод
synchronized void changeValue(){
    for (int i = 0; i < 10; i++){
    count++;
    System.out.print(count + " ");
    }
}

    @Override
    public void run() {
            changeValue();
    }
}