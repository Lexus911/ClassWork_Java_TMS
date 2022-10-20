package com.example.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class Lesson10_2 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Planet", "Saturn");
        hashMap.put("Earth", "Country");
        hashMap.put("Animal", "cat");
        hashMap.put("Earth", "Ocean");

        System.out.println(hashMap);
        System.out.println(hashMap.get("Animal"));
        System.out.println(hashMap.keySet());

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("A", "C");
        treeMap.put("B", "A");
        treeMap.put("C", "D");
        treeMap.put("D", "B");

        System.out.println(treeMap);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");

        int index = arrayList.indexOf("two");
        arrayList.remove(index);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        ArrayList<Person> arrayList2 = new ArrayList<>();
        arrayList2.add(new Person("Alex", 23));
        arrayList2.add(new Person("Dima", 45));
        arrayList2.add(new Person("Andrew", 33));
        arrayList2.add(new Person("Alex", 31));
        arrayList2.add(new Person("Masha", 19));
        arrayList2.add(new Person("Alexandr", 44));

        System.out.println(arrayList2);

//Сортировка по определённому значению объекта
        Collections.sort(arrayList2, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return String.valueOf(person.getName()).compareTo(String.valueOf(t1.getName()));
            }
        });

        for(Person person : arrayList2){
            System.out.println(person.getName());
        }
    }
}

class Person{
    private final String name;
    private final int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}