package Hillel.Home;

import java.util.Random;

public class home3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int i = 0;
        Random random = new Random();
        for ( i=0 ; i < 1000; i++){
        int a = random.nextInt(10);
        numbers[a]++;
        }
        for (i=0; i < numbers.length;i++){
            System.out.println("Кількість = " + i + " : " + numbers[i]);

        }
    }

}
