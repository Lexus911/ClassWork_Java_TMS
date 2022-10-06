package com.example.lib;

import java.util.Objects;

//equals, hashcode
public class Lesson7_4 {
    public static void main(String[] args) {
        Person person1 = new Person("Alex");
        Person person2 = new Person("Alex");
        Person person3 = new Person("Alexandr");

        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}
class Person{
    String name;

    Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}