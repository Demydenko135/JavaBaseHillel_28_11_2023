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
        Person Guy1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person Guy2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person Guy3 = new Person("Sherlock", "Holmes", "London", "37742123513");

        System.out.println(Guy1.personInfo());
        System.out.println(Guy2.personInfo());
        System.out.println(Guy3.personInfo());
    }
}

