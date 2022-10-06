package com.example.lib;

//Объект как параметр метода

public class Lesson7_3 {
    public static void main(String[] args) {

        Parent parent = new Parent();
        Mum mum = new Mum();
       checkType(mum);

       Lesson7_3 lesson7_3 = new Lesson7_3();
        System.out.println(lesson7_3.getName(""));

    }

    String getName(String name){
        if(name.isEmpty()){
            return "Name can't be empty";
        }else{
            return name;
        }
    }



    static void checkType(Object object){
        if(object instanceof Parent){
            ((Parent)object).walk();
        } else {
            System.out.println("Not parent");
        }
    }
}

class Parent{
    void walk(){
        System.out.println("parent walk");
    }

}
class Dad extends Parent{
void walk(){
    System.out.println("dad walks");
}
}
class Mum extends Parent{
    void walk(){
        System.out.println("mum walks");
    }
    void sleep(){
        System.out.println("mum is sleeping");
    }

}
