package Hillel.Home;
import java.util.Scanner;

public class Homework17_2 {

    public enum Drinks {
        COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA
    }

    public static class Prices {
        public static final double COFFEE_PRICE = 1.5;
        public static final double TEA_PRICE = 0.9;
        public static final double LEMONADE_PRICE = 1.0;
        public static final double MOJITO_PRICE = 2.08;
        public static final double MINERAL_WATER_PRICE = 1.3;
        public static final double COCA_COLA_PRICE = 1.6;

        public static double getPrice(Drinks drink) {
            switch (drink) {
                case COFFEE:
                    return COFFEE_PRICE;
                case TEA:
                    return TEA_PRICE;
                case LEMONADE:
                    return LEMONADE_PRICE;
                case MOJITO:
                    return MOJITO_PRICE;
                case MINERAL_WATER:
                    return MINERAL_WATER_PRICE;
                case COCA_COLA:
                    return COCA_COLA_PRICE;
                default:
                    return 0;
            }
        }
    }

    public static class Statistics {
        public static int totalDrinksSold = 0;
        public static double totalRevenue = 0;
    }

    public static void makeCoffee(int quantity) {
        double cost = Prices.COFFEE_PRICE * quantity;
        Statistics.totalDrinksSold += quantity;
        Statistics.totalRevenue += cost;
        System.out.println("Making Coffee x" + quantity + ". Total cost: $" + cost);
    }

    public static void makeTea(int quantity) {
        double cost = Prices.TEA_PRICE * quantity;
        Statistics.totalDrinksSold += quantity;
        Statistics.totalRevenue += cost;
        System.out.println("Making Tea x" + quantity + ". Total cost: $" + cost);
    }

    public static void makeLemonade(int quantity) {
        double cost = Prices.LEMONADE_PRICE * quantity;
        Statistics.totalDrinksSold += quantity;
        Statistics.totalRevenue += cost;
        System.out.println("Making Lemonade x" + quantity + ". Total cost: $" + cost);
    }

    public static void makeMojito(int quantity) {
        double cost = Prices.MOJITO_PRICE * quantity;
        Statistics.totalDrinksSold += quantity;
        Statistics.totalRevenue += cost;
        System.out.println("Making Mojito x" + quantity + ". Total cost: $" + cost);
    }

    public static void makeMineralWater(int quantity) {
        double cost = Prices.MINERAL_WATER_PRICE * quantity;
        Statistics.totalDrinksSold += quantity;
        Statistics.totalRevenue += cost;
        System.out.println("Dispensing Mineral Water x" + quantity + ". Total cost: $" + cost);
    }

    public static void makeCocaCola(int quantity) {
        double cost = Prices.COCA_COLA_PRICE * quantity;
        Statistics.totalDrinksSold += quantity;
        Statistics.totalRevenue += cost;
        System.out.println("Dispensing Coca Cola x" + quantity + ". Total cost: $" + cost);
    }

    public static void prepareDrink(Drinks choice, int quantity) {
        switch (choice) {
            case COFFEE:
                makeCoffee(quantity);
                break;
            case TEA:
                makeTea(quantity);
                break;
            case LEMONADE:
                makeLemonade(quantity);
                break;
            case MOJITO:
                makeMojito(quantity);
                break;
            case MINERAL_WATER:
                makeMineralWater(quantity);
                break;
            case COCA_COLA:
                makeCocaCola(quantity);
                break;
            default:
                System.out.println("Invalid drink choice");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        do {
            System.out.println("Choose a drink: (1) Coffee, (2) Tea, (3) Lemonade, (4) Mojito, (5) Mineral Water, (6) Coca Cola, (0) Exit");
            String input = scanner.next();

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            if (choice == 0) {
                break;
            }

            Drinks selectedDrink = getDrinkFromChoice(choice);

            if (selectedDrink != null) {
                System.out.println("Enter quantity:");
                String quantityInput = scanner.next();

                try {
                    int quantity = Integer.parseInt(quantityInput);
                    prepareDrink(selectedDrink, quantity);
                    System.out.printf("Total cost for %s x%d: $%.2f%n", selectedDrink.toString(), quantity, quantity * Prices.getPrice(selectedDrink));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid quantity input. Please enter a number.");
                }
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 0);

        System.out.println("Total drinks sold: " + Statistics.totalDrinksSold);
        System.out.println("Total revenue: $" + Statistics.totalRevenue);

        scanner.close();
    }

    private static Drinks getDrinkFromChoice(int choice) {
        switch (choice) {
            case 1:
                return Drinks.COFFEE;
            case 2:
                return Drinks.TEA;
            case 3:
                return Drinks.LEMONADE;
            case 4:
                return Drinks.MOJITO;
            case 5:
                return Drinks.MINERAL_WATER;
            case 6:
                return Drinks.COCA_COLA;
            default:
                return null;
        }
    }
}
