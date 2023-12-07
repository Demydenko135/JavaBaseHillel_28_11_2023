package Hillel.lesson5;

import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Будь ласка введіть імʼя першої команди");
        String Team1Name = scanner.nextLine();
        System.out.println("Імʼя першої команди - " + Team1Name);


        System.out.println("Введіть кількість фрагів гравця №-1");
        int Player1_Team1 = 0;
        if (scanner.hasNextInt()){
            Player1_Team1 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-1 = " + Player1_Team1 );


        System.out.println("Введіть кількість фрагів гравця №-2");
        int Player2_Team1 = 0;
        if (scanner.hasNextInt()){
            Player2_Team1 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-2 = " + Player2_Team1 );

        System.out.println("Введіть кількість фрагів гравця №-3");
        int Player3_Team1 = 0;
        if (scanner.hasNextInt()){
            Player3_Team1 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-3 = " + Player3_Team1 );

        System.out.println("Введіть кількість фрагів гравця №-4");
        int Player4_Team1 = 0;
        if (scanner.hasNextInt()){
            Player4_Team1 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-4 = " + Player4_Team1 );

        System.out.println("Введіть кількість фрагів гравця №-5");
        int Player5_Team1 = 0;
        if (scanner.hasNextInt()){
            Player5_Team1 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-5 = " + Player5_Team1);

        int sum_Team1 = Player1_Team1 + Player2_Team1 + Player3_Team1 + Player4_Team1 + Player5_Team1;
        int players1 = 5;
        double avarage1 = (double) sum_Team1/players1;
        System.out.println("Середнє арифметичне : " + avarage1);

        ////////////////////////////////////////////////////
        scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Будь ласка введіть імʼя другої команди");
        String Team2Name = scanner.nextLine();
        System.out.println("Імʼя другої команди - " + Team2Name);

        System.out.println("Введіть кількість фрагів гравця №-1");
        int Player1_Team2 = 0;
        if (scanner.hasNextInt()){
            Player1_Team2 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-1 = " + Player1_Team2 );


        System.out.println("Введіть кількість фрагів гравця №-2");
        int Player2_Team2 = 0;
        if (scanner.hasNextInt()){
            Player2_Team2 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-2 = " + Player2_Team2 );

        System.out.println("Введіть кількість фрагів гравця №-3");
        int Player3_Team2 = 0;
        if (scanner.hasNextInt()){
            Player3_Team2 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-3 = " + Player3_Team2 );

        System.out.println("Введіть кількість фрагів гравця №-4");
        int Player4_Team2 = 0;
        if (scanner.hasNextInt()){
            Player4_Team2 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-4 = " + Player4_Team2 );

        System.out.println("Введіть кількість фрагів гравця №-5");
        int Player5_Team2 = 0;
        if (scanner.hasNextInt()){
            Player5_Team2 = scanner.nextInt();
        }else {
            System.out.println("Ви ввели не правильні дані, перезапустіть будь ласка програму !!");
            System.exit(0);
        }

        System.out.println("Кількість фрагів гравця №-5 = " + Player5_Team2 );

        int sum_Team2 = Player1_Team2 + Player2_Team2 + Player3_Team2 + Player4_Team2 + Player5_Team2;
        int players2 = 5;
        double avarage2 = (double) sum_Team2/players2;
        System.out.println("Середнє арифметичне : " + avarage2);
        System.out.println(avarage1);
        System.out.println(avarage2);

        System.out.println();

        if (avarage1 > avarage2){
            System.out.println( Team1Name + " Команда перемогла");
        } else if (avarage1 < avarage2) {
            System.out.println(Team2Name + " Команда перемогла");
        }
        else{
            System.out.println("Нічия");
        }





    }
}
//System.out.println("please enter integer");
//        int intValue = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("int value = " + intValue);