package Hillel.Home;


import java.util.Random;

public class Home1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }//вивести значення елементів масиву
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
//вивести значення найбільшого елементу//вивести значення найменшого елемменту
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                System.out.println("елемент " + arr[i] + " більше ніж " + max);
                max = arr[i];
            }
        }
        System.out.println("_______");
        System.out.println(max);




    }
}
