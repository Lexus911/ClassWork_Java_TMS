package com.example.lib;

public class Lesson5_1 {
    public static void main(String[] args) {
     Friend friend = new Friend("Alex", 30, "05.03.1990");
     Friend friend1 = new Friend("Andrew", 28);
//     friend.age = 30;
//     friend.name = "Alex";
     friend.born();
     friend1.born();


    }

}
class Friend{
   private String name;
    private int age;
    private String birthdate;

    //конструктор
    public Friend(String name2, int age2, String birthdate2){
        this.name = name2;
        this.age = age2;
        this.birthdate = birthdate2;
    }
    public Friend(String name2, int age2){
        this.name = name2;
        this.age = age2;

    }

    void born(){
        String congratulations = "";
        if(birthdate == null || birthdate.isEmpty()){
            congratulations = name + " has no birthdate.";
        }else{
            congratulations = name + " has birthdate on: " + birthdate + "," + " he is "
                    + age + " years old.";
        }
        System.out.println(congratulations);
    }
}