package client;

import people.Address;
import people.PeopleManager;
import people.Person;

import java.util.Scanner;

public class PeopleClient {

    private static int readInt(Scanner scanner) {
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

    private static long readLong(Scanner scanner) {
        String input = scanner.nextLine();
        return Long.parseLong(input);
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
        PeopleManager pm = new PeopleManager(); //initializing the people manager
        boolean flag = true;
        Scanner scanner = new Scanner(System.in); //initializing the object scanner of Scanner class
        while (flag) {
            System.out.println("1.Enter Person details");
            System.out.println("2.View Person Details");
            System.out.println("3.Edit Person Details");
            System.out.println("4.Exit");
            System.out.println("Enter choice");
            int ch = readInt(scanner);
            if (ch == 1) {
                pm.addPerson(readPerson(scanner));
            }
            if (ch == 2) {
                pm.printPersons();
            }
            if (ch == 3) {
                System.out.println("Enter id of person whose details you want to edit:");
                long id = readLong(scanner);
               /*
               we are receiving this value{person} from getPerson of PeopleManager class whose id is equal
               to the id of the value passed by the user and storing in a Person datatype and naming the variable person.
                */
                Person person = pm.getPerson(id);
                if(person==null) {
                    System.out.println("No such person exists");
                } else {
                    System.out.println("Edit menu:");
                    System.out.println("1.Name");
                    System.out.println("2.Age");
                    System.out.println("Enter your choice");
                    int ch1 = readInt(scanner);
                    if (ch1 == 1) {
                        System.out.println("Enter new name");
                        String name = scanner.nextLine();
                        person.setName(name);
                    }
                    if (ch1 == 2) {
                        System.out.println("Enter new age");
                        int age = readInt(scanner);
                        person.setAge(age);
                    }
                }

            }
            if (ch == 4) {
                break;
            }
        }
    }

}
