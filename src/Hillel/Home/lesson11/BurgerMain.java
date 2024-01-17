package Hillel.Home.lesson11;

public class BurgerMain {

    public static void main(String[] args) {

        Burger burgerStandard = new Burger();
        Burger burgerVegan = new Burger(true, true, true, true);
        Burger burgerDoubleMeat = new Burger(true, true, true, true, true);

    }
}

class Burger {

    private boolean bun;
    private boolean meat;
    private boolean cheese;
    private boolean veggies;
    private boolean mayo;

    public Burger() {
        this.bun = true;
        this.meat = true;
        this.cheese = true;
        this.veggies = true;
        this.mayo = true;
        System.out.println("Звичайний бургер: булочка, м'ясо, сир, зелень, майонез.");
    }

    public Burger(boolean bun, boolean meat, boolean cheese, boolean veggies) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        System.out.println("Дієтичний бургер (без майонезу): булочка, м'ясо, сир, зелень.");
    }

    public Burger(boolean bun, boolean meat, boolean cheese, boolean veggies, boolean mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.veggies = veggies;
        this.mayo = mayo;
        System.out.println("Бургер з подвійним м'ясом: булочка, подвійне м'ясо, сир, зелень, майонез.");
    }
}
