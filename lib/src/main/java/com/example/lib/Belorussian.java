package com.example.lib;

public class Belorussian extends Human {
    public static void main(String[] args) {
        Belorussian belorussian = new Belorussian();
        German german = new German();
        belorussian.speakLanguage();
        german.speakLanguage();
    }

    @Override
    void speakLanguage() {
        System.out.println("I speak belorussian language");
    }
}
class German extends Human{

    @Override
    void speakLanguage() {
        System.out.println("I speak german language");
    }
}
abstract class Human{
    abstract void speakLanguage();
}