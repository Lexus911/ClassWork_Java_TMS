package com.example.lib;

import java.util.Arrays;
import java.util.Random;

public class Lesson9_3 {
    public static void main(String[] args) {
        //Вывод рандомного числа
        int[] massive = new int[10];
        Random random = new Random();
        for (int element = 0; element < massive.length; element++) {
            massive[element] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(massive));


        //Многомерные массивы
        int[][] massive2D = new int[][]{{1, 2, 3}, {4, 5, 6}};
        for (int massive1D = 0; massive1D < massive2D.length; massive1D++) {
            for (int element = 0; element < massive2D[massive1D].length; element++) {
                System.out.print(massive2D[massive1D][element] + "\t");
            }
            System.out.println();
        }
        System.out.println();

//2 способ через foreach
        for (int[] massive1D : massive2D) {
            System.out.println(Arrays.toString(massive1D));
            for (int element : massive1D) {
                //System.out.print(element + " ");  вывод элементов массива
            }
        }

        System.out.println();

        //Отложенная инициализация
        int[][] numbers = new int[3][3];
        numbers[0][0] = 8;
        numbers[0][1] = 9;
        numbers[1][0] = 11;
        numbers[1][1] = 12;
        for (int massive1D = 0; massive1D < numbers.length; massive1D++) {
            for (int element = 0; element < numbers[massive1D].length; element++) {
                System.out.print(numbers[massive1D][element] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        String[][]devs = new String[][]{
                {"IOS", "Android", "Flutter"},
                {"developer"}
        };
        System.out.println("I am " + devs[0][1] + " " + devs[1][0]);

        System.out.println();

        // Трёхмерный массив
        int[][][]numbers1 = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };
        for(int[][] numbers2D : numbers1){
            for (int[] numbers1D : numbers2D){
                for (int number1 : numbers1D){
                    System.out.print(number1 + "\t");
                }
                System.out.println();
            }
        }
        System.out.println(Arrays.deepToString(numbers1));
        System.out.println();

        for(int numbers2D = 0; numbers2D < numbers1.length; numbers2D++){
            for (int numbers1D = 0; numbers1D < numbers1[numbers2D].length; numbers1D++){
                for (int numbers2 = 0; numbers2 < numbers1[numbers2D][numbers1D].length; numbers2++){
                    System.out.print(numbers1[numbers2D][numbers1D][numbers2] + "\t" );
                }
                System.out.println();
            }
        }
    }
}