package Hillel.Home.lesson11;

public class BurgerMain {

    public static void main(String[] args) {

        burger BurgerStandart = new burger();

        burger BurgerVegan = new burger(true, true, true, true);

        burger BurgerWithExtraMeet = new burger(true, true, true, true, true);

    }

}

class burger {

    private boolean bun;

    private boolean meat;

    private boolean cheese;

    private boolean veggies;

    private boolean mayo;

    public burger() {

        this.bun = true;

        this.meat = true;

        this.cheese = true;

        this.veggies = true;

        this.mayo = true;

        System.out.println("Звичайний бургер : булочка, м'ясо, сир, зелень, майонез. ");

    }

    public burger(boolean bun, boolean meat, boolean cheese, boolean veggies) {

        this.bun = true;

        this.meat = true;

        this.cheese = true;

        this.veggies = true;

//        this.mayo = true;

        System.out.println("Дієтичний бургер (без майонезу): булочка, м'ясо, сир, зелень.");

    }

    public burger(boolean bun, boolean meat, boolean cheese, boolean veggies, boolean mayo) {

        this.bun = true;

        this.meat = true;

        this.cheese = true;

        this.veggies = true;

        this.mayo = true;


        System.out.println("Бургер з подвійним м'ясом: булочка, подвійне мʼясо, сир, зелень, майонез.");

    }
}

