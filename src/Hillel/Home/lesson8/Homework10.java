package Hillel.Home.lesson8;

import java.util.Arrays;
//import java.util.SortedMap;


public class Homework10 {
    public static void main(String[] args) {
        int[] FirstValue = new int[7];
        int[] SecondValue = new int[7];
        int counter = 0;

        for (int i = 0; i < FirstValue.length - 1; i++) {
            FirstValue[i] = (int) (Math.random() * 10);
            SecondValue[i] = (int) (Math.random() * 10);
            if (FirstValue[i] == SecondValue[i])
                counter++;
        }
        Arrays.sort(FirstValue);
        Arrays.sort(SecondValue);

        System.out.println(Arrays.toString(FirstValue ));
        System.out.println(Arrays.toString(SecondValue));
        System.out.println("Кількість збігів :  " + counter);

    }
}
