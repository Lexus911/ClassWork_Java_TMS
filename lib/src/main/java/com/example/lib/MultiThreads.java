package com.example.lib;

//1 3 4 5 6 7 8 9 10 11 2 12 13 14 15 16 17 18 19 20  - пример RaceCondition
public class MultiThreads {
    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();

        Thread thread1 = new Thread(threadClass);
        thread1.start();
        Thread thread2 = new Thread(threadClass);
        thread2.start();

    }
}
class ThreadClass implements Runnable{

private int count = 0;

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            count++;
            System.out.print(count + " ");
        }
    }
}