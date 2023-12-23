package Hillel.lesson7;

import java.util.Arrays;

public class Homework9 {
    public static void main(String[] args) {
        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];
        int avg1 = 0;
        int avg2 = 0;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < teamOne.length; i++) {
            teamOne[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            teamTwo[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
           sum += teamOne[i];
           sum2 += teamTwo[i];
        }
            avg1 = sum / teamOne.length;
        avg2 = sum2/ teamTwo.length;

        System.out.print(Arrays.toString(teamOne) + " Середній вік гравців першої команди : " + avg1);
        System.out.println();
        System.out.println(Arrays.toString(teamTwo)+ " Середній вік гравців другої команди : " +avg2);
    }
    }
