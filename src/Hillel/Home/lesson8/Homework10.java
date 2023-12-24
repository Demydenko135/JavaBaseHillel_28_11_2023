package Hillel.Home.lesson8;

import java.util.Arrays;

public class Homework10 {
    public static void main(String[] args) {
        int[] FirstValue = new int[7];
        int[] SecondValue = new int[7];
        int counter = 0;

        for (int i = 0; i < FirstValue.length; i++) {
            FirstValue[i] = (int) (Math.random() * 10);
            SecondValue[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(FirstValue);
        Arrays.sort(SecondValue);

        System.out.println(Arrays.toString(FirstValue));
        System.out.println(Arrays.toString(SecondValue));
        for (int i = 0; i < FirstValue.length; i++) {
            if (FirstValue[i] == SecondValue[i]) {
                counter++;
            }
        }
        System.out.println("Кількість збігів :  " + counter);
    }
}



