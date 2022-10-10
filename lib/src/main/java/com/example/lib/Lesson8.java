package com.example.lib;

public class Lesson8 {
    public static void main(String[] args) {
        try{
            getWrongValue(null);
        }catch (NullPointerException e){
            System.out.println("caught NullPointerException");
        }catch (Exception e){
            System.out.println("caught Exception");
        }
        finally {
            System.out.println("do if success or exception thrown");
        }
    }
    static void getWrongValue(Integer value){
        System.out.println(value.toString());
    }
}
