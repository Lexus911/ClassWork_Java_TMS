package com.example.lib;

import java.util.Scanner;

public class Lesson9_2 {
    public static void main(String[] args) {
        //ввод с консоли
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

        if(scanner.hasNextInt()){
        int enteredValue = scanner.nextInt();
        System.out.println("Your value is: " + enteredValue);
        }else {
            System.out.println("Your inout value is wrong...");
        }
    }
}
