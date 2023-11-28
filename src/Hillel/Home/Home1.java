package Hillel.Home;


import java.util.Random;

public class Home1 {
    public static void main(String[] args) {
        int a1 = new Random().nextInt(100);
        int a2 = new Random().nextInt(100);
        int a3 = new Random().nextInt(100);
        //вивести значення а1 а2 а3
        System.out.println(a1 + " " + a2 + " " + a3);
//вивести більше з чисел а1 і а2
       int max;
        if (a1 > a2) {
            System.out.println(a1);
            max = a1;
        }
        else {
            System.out.println(a2);
            max = a2;
        }
// вивести найбільше з трьох чисел
    if (max > a3) {
        System.out.println(max);
    }
    else {
        System.out.println(a3);
    }
//вивести найменше з трьох чисел
        if (a1 < a2){
            System.out.println();
        }

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }//вивести значення елементів масиву
//вивести значення найбільшого елементу//вивести значення найменшого елемменту


    }
}
