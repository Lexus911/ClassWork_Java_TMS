package com.example.lib;

import java.util.Arrays;

public class Lesson9 {
    public static void main(String[] args) {
        //способы создания массива
        String[] massive = {"show", "must","go on"};
        String[] massive2 = new String[5];
        massive2[0] = "we";
        massive2[1] = "will";
        massive2[2] = "rock";
        massive2[3] = "you";
        massive2[4] = "!";
        int[] massive3 = new int[5];

        //вывод значений массива
        for(int i = 0; i < massive.length; i++){
            System.out.println(massive[i]);
        }

        for(int i = 0; i < massive2.length; i++){
            System.out.println(massive2[i]);
        }

        for(int i = 0; i < massive3.length; i++){
            System.out.println(massive3[i]);
        }

        //замена элемента массива и "расширение"(т.к. мы не можем расишрять массив, создаём новый массив с добавлением нового)
        String[] massive4 = new String[]{"We", "are", "the", "champions"};
        massive4 = new String[]{"We", "are", "the", "champions","country"};
        massive4[4] = "country";
        System.out.println(massive4[4]);

        //сортировка массива
        int[] massive5 = new int[]{16, -17, 22, 0, 1, 33, 5, 4, 7};

        for(int i = 0; i <= massive5.length-1; i++){
            System.out.print(massive5[i] + " ");
        }

        Arrays.sort(massive5);
        System.out.println("\n");
        for(int i = 0; i <= massive5.length-1; i++){
            System.out.print(massive5[i] + " ");
        }

        System.out.println();

        //вывод индекса массива по значению, только с отсортированным массивом
        int index = Arrays.binarySearch(massive5, 33);
        System.out.println(index);

        //посмотреть значения массива, вывод значений через цикл
        System.out.println(Arrays.toString(massive5));


        // способы вывода массива

        for(int i = 0; i <= massive5.length-1; i++){
            System.out.print(massive5[i] + " ");
        }

        System.out.println();

        for(int element : massive5){
            System.out.print(element + " ");
        }
        System.out.println();
        //подсчитать среднюю температуру
        int[] temp = new int[]{25, 19, 22, 0, 21, 33, 5, 4, -7};
        double averageTemp;
        int sumOfTemp = 0;
        for(int i = 0; i <= temp.length-1; i++){
            sumOfTemp += temp[i];
        }
        averageTemp = (double) sumOfTemp/temp.length;
        System.out.println(averageTemp);

        int[] mas = {25, 47, 34, 18, 96, 33, 28, 55, 87, 13};
        Arrays.sort(mas);
        System.out.println("min value: " + mas[0]);
        System.out.println("max value: " + mas[mas.length-1]);
    }
}
