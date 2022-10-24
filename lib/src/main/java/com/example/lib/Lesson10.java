package com.example.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;



public class Lesson10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();


        arrayList.add ("Show");
        arrayList.add("must");
        arrayList.add("go");

        arrayList.remove("must");
        System.out.println(arrayList.get(1));
        arrayList.add(1, "hell");
        System.out.println(arrayList.indexOf("go"));

        Collections.sort(arrayList, Comparator.<String>naturalOrder());
        System.out.println(arrayList);

        Collections.sort(arrayList, Comparator.<String>reverseOrder());
        System.out.println(arrayList);

        LinkedList<String > linkedList = new LinkedList<>();
        linkedList.add("we");

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("we");
        sortedSet.add("are");
        sortedSet.add("the");
        sortedSet.add("champions");
        sortedSet.add("champions");

        System.out.println(sortedSet);


        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Olya"));
        hashSet.add(new Student("Alex"));
        hashSet.add(new Student("John"));
        hashSet.add(new Student("Olya"));

        System.out.println();
        for(Student student : hashSet){
        System.out.println(student.getName());
        }
    }
}

class Student{
    private  String name;
    Student(String name){
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

