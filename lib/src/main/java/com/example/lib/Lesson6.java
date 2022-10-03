package com.example.lib;

//pretend inheritance
public class Lesson6 extends Bird {
    @Override
    void fly() {
        super.fly();
    }

    @Override
    void walk() {
        super.walk();
    }
}

class Bird{
    void fly(){
    }
    void walk(){

    }
}