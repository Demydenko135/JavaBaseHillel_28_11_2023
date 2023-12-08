package Hillel.Home;

import java.util.Scanner;

public class HM6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Будь ласка введіть імʼя першої команди");
        String Team1Name = scanner.nextLine();
        System.out.println("Імʼя першої команди - " + Team1Name);

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println();

            System.out.println("Введіть кількість фрагів гравця №-" + i);
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
                System.exit(0);
            }
        }


        System.out.println();

        int players1 = 5;
        double avarage1 = (double) sum / players1;
        System.out.println("Середнє арифметичне : " + avarage1);

        System.out.println();


        System.out.println("Будь ласка введіть імʼя другої команди");
        String Team2Name = scanner.nextLine();
        System.out.println("Імʼя другої команди - " + Team2Name);

        sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println();

            System.out.println("Введіть кількість фрагів гравця №-" + i);
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
                System.exit(0);
            }
        }


        int players2 = 5;
        double avarage2 = (double) sum / players2;
        System.out.println();
        System.out.println("Середнє арифметичне : " + avarage2);
        System.out.println();
        System.out.println("Команда " + Team1Name + "-" + avarage1);
        System.out.println("Команда " + Team2Name + "-" + avarage2);

        System.out.println();

        if (avarage1 > avarage2) {
            System.out.println("Перемогла команда " + Team1Name + " набрала " + avarage1 + " очків");
        } else if (avarage1 < avarage2) {
            System.out.println("Перемогла команда " + Team2Name + " набрала " + avarage2 + " очків");
        } else {
            System.out.println("Нічия");
        }
    }
}
