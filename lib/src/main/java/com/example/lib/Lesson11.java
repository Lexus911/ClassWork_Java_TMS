package com.example.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lesson11 {
    static Consumer<String> printUpperCase = str -> { // свой Consumer для forEach
        System.out.print(str.toUpperCase() + " ");
    };

    public static void main(String[] args) {
        Stream streamGenerate = Stream.generate(() -> "hello").limit(10);
        System.out.println(streamGenerate.collect(Collectors.toList()));

        IntStream intStream = IntStream.range(1, 10);
        System.out.println(Arrays.toString(intStream.toArray()));

        Stream streamFilter = Stream.of("apple", "banana", "kiwi").filter(element -> element.contains("a"));
        System.out.println(streamFilter.findFirst());

        Stream streamFilter2 = Stream.of("apple", "banana", "kiwi", "cherry").skip(2);
        System.out.println(streamFilter2.collect(Collectors.toList()));

        Stream streamFilter3 = Stream.of("apple", "banana", "kiwi", "cherry").distinct();
        System.out.println(streamFilter3.collect(Collectors.toList()));

        Stream<String> streamMap = Stream.of("apple", "banana", "kiwi", "cherry");
        String mappedString = streamMap.map(Object::toString).collect(Collectors.joining(", "));
        System.out.println(mappedString);

        Stream<String> streamMap2 = Stream.of("apple", "banana", "kiwi", "cherry");
        String mappedString2 = streamMap2.map(element -> element + " mapped").collect(Collectors.joining(" || "));
        System.out.println(mappedString2);

        Stream<String> streamMap3 = Stream.of("apple", "banana", "kiwi", "cherry");
        String mappedString3 = streamMap3.map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(mappedString3);


        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alex"));
        users.add(new User("Andrew"));
        users.add(new User("Jack"));
        users.add(new User("Mark"));
        users.add(new User("Alexandr"));

        System.out.println(users);

//        for(User user : users){
//            System.out.print(user.getName() + " ");
//        }

        users.stream().map(User::getName).forEach((n) -> {
            System.out.print(n + " ");
        });

        //System.out::println


        users.stream().map(User::getName).forEach(printUpperCase);






        }
    }


class User{
    private String name;

    User(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() { //переопределение toString
        return name;
    }
}