package Hillel;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] Pasha1 = new int[N][M];
        int[][] Pasha2 = new int[M][N];

        for (int i = 0; i < Pasha1.length; i++) {
            for (int j = 0; j < Pasha1[i].length; j++) {
                Pasha1[i][j] = (int) (Math.random() * 11);
                Pasha2[j][i] = Pasha1[i][j];
            }
        }

        for (int i = 0; i < Pasha1.length; i++) {
            System.out.println(Arrays.toString(Pasha1[i]));
        }
        for (int i = 0; i < Pasha2.length; i++) {
            System.out.println(Arrays.toString(Pasha2[i]));

        }
    }
}

//    Транспонуйте матрицю M x N. Розміри M та N задаються з консолі. Після введення повинні автоматично створюватися два масиви розміром M x N перший та N x M другий.