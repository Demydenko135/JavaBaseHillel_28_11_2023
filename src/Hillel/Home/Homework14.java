package Hillel.Home;

public class Homework14 {

    interface Smartphones {
        void call();
        void sms();
        void internet();
    }

    static class Androids implements Smartphones {
        @Override
        public void call() {
            System.out.println("Making a call on an Android phone");
        }

        @Override
        public void sms() {
            System.out.println("Sending an SMS on an Android phone");
        }

        @Override
        public void internet() {
            System.out.println("Opening the internet on an Android phone");
        }

        public void runLinuxOS() {
            System.out.println("Running Linux OS on an Android phone");
        }
    }

    static class iPhones implements Smartphones {
        @Override
        public void call() {
            System.out.println("Making a call on an iPhone");
        }

        @Override
        public void sms() {
            System.out.println("Sending an SMS on an iPhone");
        }

        @Override
        public void internet() {
            System.out.println("Opening the internet on an iPhone");
        }


        public void runiOS() {
            System.out.println("Running IOS on an iPhone");
        }
    }

    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxOS();

        System.out.println("----------------------");

        iPhones iPhone = new iPhones();
        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.runiOS();
    }
}
