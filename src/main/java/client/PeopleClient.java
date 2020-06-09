package client;

import people.Address;
import people.PeopleManager;
import people.Person;

import java.util.Scanner;

public class PeopleClient {

    private static int readInt(Scanner scanner) {
        return Integer.parseInt(scanner.nextLine());
    }

    private static Address readAddress(Scanner scanner) {
        System.out.println("Enter Pincode");
        int pincode = readInt(scanner);
        System.out.println("Enter city");
        String city = scanner.nextLine();
        System.out.println("Enter House Number");
        String hno = scanner.nextLine();
        System.out.println("Enter locality");
        String locality = scanner.nextLine();
        return new Address(pincode, city, hno, locality);
    }

    private static Person readPerson(Scanner scanner) {
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = readInt(scanner);
        System.out.println("Enter gender");
        String gender = scanner.nextLine();
        Address address = readAddress(scanner);
        return new Person(name, age, gender.charAt(0), address);
    }

    public static void main(String[] args) {
        PeopleManager pm = new PeopleManager();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        while (flag) {
            System.out.println("1.Enter Person details");
            System.out.println("2.View Person Details");
            System.out.println("3.Exit");
            System.out.println("Enter choice");
            int ch = readInt(scanner);
            if (ch == 1) {
                pm.addPerson(readPerson(scanner));
            }
            if (ch == 2) {
                pm.printPersons();
            }
            if (ch == 3) {
                flag = false;
            }
        }
    }

}
