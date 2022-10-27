package com.example.lib;

public class ThreadingWork {
    public static void main(String[] args) {

        // 1 способ создания потоков через наследование или имплементацию
        ThreadClass1 threadClass1 = new ThreadClass1(); // запуск потока на базе класса Thread
        threadClass1.start();

        ThreadClass2 threadClass2 = new ThreadClass2(); // запуск потока путём имплементации Runnable в другой поток и вызов start()
        Thread thread1 = new Thread(threadClass2);
        thread1.start();

        //2 способ создания потоков переопределение логики через анонимный класс
        ThreadClass3 threadClass3 = new ThreadClass3(){
            @Override
            public void run() {
                System.out.println("I'm running in Thread in anonym class");
            }
        };
        threadClass3.start();

        //3 спсособ создания потоков
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("I'm running in thread");
            }
        };
        thread.start();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm running in runnable");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();

}
}

class ThreadClass1 extends Thread{

    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass2 implements Runnable{

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}

class ThreadClass3 extends Thread{

    @Override
    public void run() {
        System.out.println("I'm running in Thread");
    }
}

class ThreadClass4 implements Runnable{

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}