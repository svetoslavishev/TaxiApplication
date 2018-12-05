package Application;

import MainClasses.User;

import java.util.Scanner;

public class Application {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        String userName = inputUserName();
        int userAge = inputUserAge();

        User currentUser = new User(userName, userAge);

        System.out.println("Hello, " + currentUser.getName() + "!");
        Thread.sleep(1500);
        System.out.println("Choose one of the 4 options and press enter.\n");
        Thread.sleep(1500);

        printOptions();

        int option = chooseOption();


    }

    private static String inputUserName() {
        String name = "";

        while (name.length() < 3) {
            System.out.print("Enter your name: ");
            name = scan.nextLine();

            if (name.length() < 3) {
                System.out.println("Your name should contain at least 3 symbols.");
            }
        }

        return name;
    }

    private static int inputUserAge() {
        int age = 0;

        while (age < 18) {
            System.out.print("Enter your age: ");
            age = scan.nextInt();

            if (age < 18) {
                System.out.println("You must be 18 or older to use this application.");
            }
        }

        return age;
    }

    private static void printOptions() {
        System.out.println("(1) Add a new taxi.\n(2) Add a new route.\n(3) Choose a taxi for a route.\n(4) Exit application.");
    }

    private static int chooseOption() {
        int option = 0;

        while (option != 1 && option != 2 && option != 3 && option != 4) {
            option = scan.nextInt();

            if (option != 1 && option != 2 && option != 3 && option != 4)
                System.out.print("You should enter one of the following numbers: 1, 2, 3 or 4: ");

        }

        return option;
    }
}
