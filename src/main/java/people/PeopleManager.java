package people;

public class PeopleManager {
    Person[] per;
    int counter;

    public PeopleManager() {
        per = new Person[100];
        counter = 0;
    }

    public void addPerson(Person a) {
        per[counter] = a;
        counter++;
    }

    public void printPersons() {
        System.out.println("Person details");
        for (int i = 0; i < counter; i++) {
            System.out.println(per[i]);
        }
    }
}
