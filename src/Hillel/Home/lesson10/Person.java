package Hillel.Home.lesson10;

public class Person {
    String firstName;
    String lastName;
    String city;
    String phoneNumber;

    public Person(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String personInfo() {
        return "Зателефонувати громадянинові " + firstName + " " + lastName + " з міста " + city +
                " можна за номером " + phoneNumber + ".";
    }

    public static void main(String[] args) {
        Person Guy1 = new Person("Павло", "Демиденко", "Рівне", "09875623223");
        Person Guy2 = new Person("Петро", "Щур", "Львів", "09756242124");
        Person Guy3 = new Person("Василь", "Джонсон", "Харків", "0768572645");

        System.out.println(Guy1.personInfo());
        System.out.println(Guy2.personInfo());
        System.out.println(Guy3.personInfo());
    }
}

