package com.example.lib;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class Lesson10_1 {
    public static void main(String[] args) {

        Object[] numbers = {3, 1, 4, 6, 2, 5, 7, 9, 8};

        List<Integer> arrayList = new ArrayList(Arrays.asList(numbers));
        arrayList.add(0);
        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        arrayList.toArray();

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }

        System.out.println("\n" + arrayList);

        Queue<String> queue = new PriorityQueue<String>();
        queue.offer("Show");
        queue.offer("Must");
        queue.offer("go");
        queue.offer("on");
        queue.add("hi");
        queue.add("bye");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println();

        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
        arrayDeque.add("iOS developer");
        arrayDeque.addFirst("android developer");
        arrayDeque.addLast("python developer");
        arrayDeque.push("flutter developer");


        System.out.println(arrayDeque);
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.addAll(arrayDeque);
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(2));
    }
}
