package Hillel.Home.lesson6;

public class Homework8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean containsFourOrNine = false;

            for (int j = i; j > 0; j /= 10) {
                int digit = j % 10;
                if (digit == 4 || digit == 9) {
                    containsFourOrNine = true;
                    continue;
                }
            }

            if (!containsFourOrNine) {
                System.out.println(i);
            }
        }

        }

        }


//        System.out.println(counter);






//    У Японії числа 4 та 9 вважаються нещасливими. Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так,
//        щоб у номерах шатлів не траплялося нещасливих чисел.
//        Напишіть функцію, яка виводить усі номери таких шатлів.