package Hillel.Home.lesson6;

import javax.crypto.spec.PSource;
import java.util.Random;
import java.util.Scanner;

public class homework7_13_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnumber = random.nextInt(11);
        System.out.println("Я хочу пограти з тобою в гру, відгадай число від 1 до 10, в тебе 3 спроби. ");


        for (int chance = 1; chance <= 3; chance++) {
            System.out.println("Спроба № - " + chance + ". твоє число :");

            if (scanner.hasNextInt()) {
                int yourchoise = scanner.nextInt();

                if (yourchoise == randomnumber) {
                    System.out.println("Ти вгадав, ти молодець");
                    break;
                } else {
                    System.out.println("Твоя спроба не вірна, спробуй ще раз друже");
                }

            } else {
                System.out.println("Введи будь ласка число, я не зарахую це як спробу");
                scanner.next();
                chance--;
            }


        }

            System.out.println("Гра завершена, загадане число було : " + randomnumber);

    }
}