package Hillel.Home;
import java.util.Random;
public class Home1 {
    public static void main(String[] args) {
        int x = new Random().nextInt(100);
        int y = new Random().nextInt(100);
        System.out.println("Два рандомних числа - " + x + " " + y);
        System.out.println("Cума = " + (x + y));
        System.out.println("Різниця = " + (x - y) );
        System.out.println("Добуток = " + (x * y));
        if (x > y) {
            System.out.println( "first greater");
        }
            else {
                System.out.println( "second greater" );
            }
//        if (x < y) {
//            System.out.println( "first greater");
//        }
//        else {
//            System.out.println("second greater");
//        }
        if (x == y) {
            System.out.println("Equals");
        }
            else {
            System.out.println("Not Equals");
        }
            for (int i = 0; i < x; i++) {
            System.out.println(i + 1);
        }
    }
}
