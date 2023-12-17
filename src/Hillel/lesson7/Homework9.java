package Hillel.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];



        for (int i = 0; i < teamOne.length; i++) {
            for (int j = 0; j < teamTwo.length ; j++) {
                teamOne[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
                teamTwo[j] = (int) (Math.random() * (40 - 18 + 1) + 18);
            }
            }
        System.out.print ( Arrays.toString(teamOne) );
        System.out.println();
        System.out.print(Arrays.toString(teamTwo) );
        }

        }




//   Не сильно зрозумів чому саме при такій формулі воно видає правильний діапазон.

//    Є дві команди регбі з 25 гравців різного віку у кожній.
//
//        Вік беремо випадковим чином в діапазоні від 18 до 40.
//
//        Виведіть у двох рядках вік гравців кожної команди.