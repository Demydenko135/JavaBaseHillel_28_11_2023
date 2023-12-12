package Hillel.Home.lesson6;

import java.util.Random;
import java.util.Scanner;

public class hm7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(11); // Генерація випадкового числа від 0 до 10

        System.out.println("Вгадайте число від 0 до 10. У вас 3 спроби.");

        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Спроба " + attempt + ": Введіть ваш варіант: ");

            if (scanner.hasNextInt()) {
                int userGuess = scanner.nextInt();

                if (userGuess == secretNumber) {
                    System.out.println("Вітаємо! Ви вгадали!");
                    break; // Вихід з циклу, якщо число вгадане
                } else {
                    System.out.println("Неправильно. Спробуйте ще раз.");
                }
            } else {
                System.out.println("Будь ласка, введіть ціле число.");
                scanner.next(); // Очистка введених даних
                attempt--; // Зменшення лічильника спроб, оскільки введено некоректне значення
            }
        }

        System.out.println("Гра завершена. Загадане число було: " + secretNumber);
    }
}
