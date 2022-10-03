package com.example.lib;
//interface and abstraction
public class Interface_and_abstraction {
    public static void main(String[] args) {

    }

}
abstract class Bird1{
    abstract void walk();
}
class Crow extends Bird1 implements IFlyingBird{
    @Override
    void walk() {
    }
    @Override
    public void fly1() {

    }
}
class Papugai extends Bird1 implements IFlyingBird{
    @Override
    void walk() {
    }
    @Override
    public void fly1() {

    }
}
class Penguin extends Bird1{
    @Override
    void walk() {

    }
}
interface IFlyingBird{
    void fly1();
}