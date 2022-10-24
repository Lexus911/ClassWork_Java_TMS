package com.example.lib;

public class Lesson11_1 {
    public static void main(String[] args) {
//        Operationable operationable = new Operationable() { //вариант без лямбды
//            @Override
//            public int calculate(int a, int b) {
//                return a + b;
//            }
//        };

        Operationable operationable;
        operationable = (a, b) -> a * b + 30;
        int result = operationable.calculate(10,10);
        System.out.println(result);


        Operationable1<Integer> operationable1;
        operationable1 = (a, b) -> a > b;
        boolean result1 = operationable1.calculate1(10,20);
        System.out.println(result1);

        Operationable2<Integer, String> operationable2;
        operationable2 = (a, b) -> {
            return a + b + " I'll be back";
        };
        String result2 = operationable2.calculate2(10,20);
        System.out.println(result2);


        Operationable3<Integer> operationable3;
        operationable3 = (a, b) -> System.out.println(a + b);

        operationable3.calculate3(10,20);
        }


}


@FunctionalInterface
interface Operationable { // Functional Interface
    int calculate(int a, int b);
}

interface Operationable1<T> { //Predicate
    boolean calculate1(T t, T t1);
}

interface Operationable2<T, R> { //Function
    R calculate2(T t, T t1);
}

interface Operationable3<T> { //Consumer
    void calculate3(T t, T t1);
}