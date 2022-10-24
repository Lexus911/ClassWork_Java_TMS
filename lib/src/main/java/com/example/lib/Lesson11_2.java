package com.example.lib;

import java.util.Optional;

public class Lesson11_2 {
    public static void main(String[] args) {

        Optional<Integer> optionalInteger = Optional.of(11);
        if(optionalInteger.isPresent()){
            System.out.println(optionalInteger.get());
        }else {
            System.out.println("no value");
        }
    }
}
