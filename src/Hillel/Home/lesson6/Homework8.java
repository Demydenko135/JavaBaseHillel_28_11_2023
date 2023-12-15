package Hillel.Home.lesson6;

public class Homework8 {
    public static void main(String[] args) {
                int number = 1;
                int goal = 100;
                int counter = 0;
                int i1 = number % 10;
                int i2 = (number / 10) % 10;
                int i3 = number / 100;

                while (counter < goal) {
                    if (i1 != 4 && i1 != 9 && i2 != 4 && i2 != 9 && i3 != 4 && i3 != 9) {
                        System.out.println(number);
                        counter++;
                    }
                    number++;
                    i1 = number % 10;
                    i2 = (number / 10) % 10;
                    i3 = number / 100;
                }
        System.out.println( "Загальна кількість шатлів = " +  counter);
            }
        }























