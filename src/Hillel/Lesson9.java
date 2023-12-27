package Hillel;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        System.out.println("Ввведіть M значення : ");
        Scanner scanner = new Scanner(System.in);
        int M = 0;
        int N = 0;
        if (scanner.hasNextInt()) {
            M = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }
        System.out.println("Введіть N значення : ");
        if (scanner.hasNextInt()) {
            N = scanner.nextInt();
            scanner.nextLine();
        } else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }


        int[][] Pasha1 = new int[N][M];
        int[][] Pasha2 = new int[M][N];

        for (int i = 0; i < Pasha1.length; i++) {
            for (int j = 0; j < Pasha1[i].length; j++) {
                Pasha1[i][j] = (int) (Math.random() * 11);
                Pasha2[j][i] = Pasha1[i][j];
            }
        }
        System.out.println("Результат : ");

        for (int i = 0; i < Pasha1.length; i++) {
            System.out.println(Arrays.toString(Pasha1[i]));
        }
        System.out.println("Транспортована матриця : ");
        for (int i = 0; i < Pasha2.length; i++) {
            System.out.println(Arrays.toString(Pasha2[i]));

        }
    }
}