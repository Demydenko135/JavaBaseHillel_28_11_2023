package Hillel.Home.lesson6;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 11);

        int value = 3;
        int counter = 0;
        System.out.println("Введіть своє число від 1 до 10 ");
        if (scanner.hasNextInt()) {
        } else {
            System.out.println("Не правильні дані, перезапустіть програму");
            System.exit(0);
        }

        while (value > counter) {

//            System.out.print("Ваше число = ");
            int yourvalue = scanner.nextInt();
            counter++;

            if (yourvalue == random) {
                System.out.println("Ви використали всі спроби,випадкове число було = " + random);
                break;
            } else {
                System.out.println("Спробуйте ще раз ");
//                if (counter == 3) {
//                    System.out.println("Ви використали всі спроби,випадкове число було = " + random);
//                    break;
            }

        }

    }

    }

