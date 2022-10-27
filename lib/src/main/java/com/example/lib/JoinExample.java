package com.example.lib;

public class JoinExample {
    public static void main(String[] args) {
        System.out.println("Main thread is running");

        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Second thread is running");
            }
        };
        thread.start();

        try {
            thread.join();
        } catch (Exception e) {
            System.out.println("caught exception");;
        }
        System.out.println("Main thread is finished");


//        ThreadCLass5 threadCLass5 = new ThreadCLass5();
//
//        Thread thread1 = new Thread(threadCLass5);
//        thread1.start();
//
//        try {
//            thread1.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        Thread thread2 = new Thread(threadCLass5);
//        thread2.start();


        ThreadCLass6 threadCLass6 = new ThreadCLass6();
        Thread thread3 = new Thread(threadCLass6);
        thread3.start();
        long start = System.currentTimeMillis();
        System.out.println("called in thread: " + Thread.currentThread().getName() + " " + start);
    }
}

class ThreadCLass5 extends Thread{

    private int count;

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            count++;
            System.out.print(count + " ");
        }
    }
}

class ThreadCLass6 extends Thread{

    private int count;

    @Override
    public void run() {

        try {
            sleep(200);
        }catch (Exception e){
        }

        long start = System.currentTimeMillis();
        Thread thread = Thread.currentThread();
        System.out.println("I run this code in: " + thread.getName() + " " + start);
    }
}