package Hillel.Home;

import java.util.Random;

public class Home2 {
    public static void main(String[] args) {
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++){
        a[i] = new Random().nextInt(10);
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + "    ");
        }
        System.out.println();





        for ( int i = 0; i < a.length; i++){
        if (a[i] % 2 == 0){
            System.out.println(a[i]);
        }
        }
        System.out.println();
        System.out.println();

    }
}
