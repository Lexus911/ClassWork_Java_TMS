package com.example.lib;

public class Lesson7_2 {//внешний класс
    private String privateVar = "Show must go on";
    String publicVar = "We will rock you";
    static String staticVar = "Radio GAga";

    public static void main(String[] args) {
        Lesson7_2 lesson7_2 = new Lesson7_2();
        lesson7_2.callInnerClass();

    }
    void callInnerClass(){
        InnerClass innerClass = new InnerClass();
//        innerClass.callOuterClassVariable();
    }
    class InnerClass{//внутренний класс
        void callOuterClassVariable(){
            System.out.println(privateVar);//имеет доступ к private
            System.out.println(publicVar);
            System.out.println(staticVar);

        }
    }
    static class NestedClass{//статичный вложенный класс
        void callOuterClassVariable(){
//          System.out.println(privateVar); //не имеет доступ к private внешнего класса
//          System.out.println(publicVar);
            System.out.println(staticVar); // вызывает только статические переменные и методы
//            callInnerClass();
        }
    }
}
