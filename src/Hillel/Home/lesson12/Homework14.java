package Hillel.Home.lesson12;

import java.time.LocalDate;
import java.time.Period;

public class Homework14 {

    static class FitnessTrackerUser {
        private final String firstName;
        private final String lastName;
        private final LocalDate birthDate;
        private final String email;
        private final String phoneNumber;
        private double weight;
        private String bloodPressure;
        private int dailySteps;
        private int age;

        public FitnessTrackerUser(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String email, String phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
            this.email = email;
            this.phoneNumber = phoneNumber;
            calculateAge();
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void setBloodPressure(String bloodPressure) {
            this.bloodPressure = bloodPressure;
        }

        public void setDailySteps(int dailySteps) {
            this.dailySteps = dailySteps;
        }

        private void calculateAge() {
            LocalDate currentDate = LocalDate.now();
            Period period = Period.between(birthDate, currentDate);
            this.age = period.getYears();
        }

        public void printAccountInfo() {
            System.out.println("User Information:");
            System.out.println("Name: " + firstName + " " + lastName);
            System.out.println("Birth Date: " + birthDate);
            System.out.println("Email: " + email);
            System.out.println("Phone Number: " + phoneNumber);
            System.out.println("Weight: " + weight);
            System.out.println("Blood Pressure: " + bloodPressure);
            System.out.println("Daily Steps: " + dailySteps);
            System.out.println("Age: " + age);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FitnessTrackerUser user1 = new FitnessTrackerUser("John", "Cocker", 15, 6, 1990, "john@song.com", "123-456-7890");
        user1.setWeight(75.5);
        user1.setBloodPressure("120/80");
        user1.setDailySteps(10000);
        user1.printAccountInfo();

        FitnessTrackerUser user2 = new FitnessTrackerUser("Alice", "Smith", 20, 8, 1985, "alice@cooper.com", "987-654-3210");
        user2.setWeight(65.2);
        user2.setBloodPressure("130/85");
        user2.setDailySteps(8521);
        user2.printAccountInfo();

        FitnessTrackerUser user3 = new FitnessTrackerUser("Pedro", "Hizo", 3, 11, 1999, "Pedro@maysh.gmail.com", "462-632-6328");
        user3.setWeight(99.9);
        user3.setBloodPressure("150/100");
        user3.setDailySteps(3120);
        user3.printAccountInfo();

        FitnessTrackerUser user4 = new FitnessTrackerUser("Milko", "Cro-Crop", 7, 8, 1991, "Mirco@cop.gmail.com", "511-521-5212");
        user4.setWeight(78.1);
        user4.setBloodPressure("127/83");
        user4.setDailySteps(5600);
        user4.printAccountInfo();
    }
}
