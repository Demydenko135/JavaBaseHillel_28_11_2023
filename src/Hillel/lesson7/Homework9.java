package Hillel.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];
        int counter = 0;

        for (int i = 0; i < teamOne.length; i++) {
            teamOne[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            teamTwo[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
//
//   Не сильно зрозумів чому саме при такій формулі воно видає правильний діапазон.
           counter ++;

//
            }
        System.out.print(Arrays.toString(teamOne) );
        System.out.println(counter);
        System.out.println();
        System.out.print(Arrays.toString(teamTwo) );
        System.out.println(counter);
            counter++;

        }

    }



//    Є дві команди регбі з 25 гравців різного віку у кожній.
//
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//        Виведіть у двох рядках вік гравців кожної команди.