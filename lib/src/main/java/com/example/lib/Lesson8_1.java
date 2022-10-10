package com.example.lib;

import java.io.FileNotFoundException;

public class Lesson8_1 {
    public static void main(String[] args) {

        try {
            throwUnCheckedException();//необрабатываемое исключение
        }catch (NullPointerException e){
            System.out.println("handle unchecked exception");
            System.out.println(e.getMessage());
        }

        try {
            throwCheckedException(); //обрабатываемое исключение
        }catch (FileNotFoundException e){
            System.out.println("handle checked exception");
            System.out.println(e.getMessage());
        }
    }
    static void throwUnCheckedException() throws NullPointerException{
        throw new NullPointerException("runTime");
    }
    static void throwCheckedException() throws FileNotFoundException{
        throw new FileNotFoundException("compileTime");
    }
}
