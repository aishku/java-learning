package people;

public class Person {
    String name;
    int age;
    char gender;
    Address address;

    public Person(String name,int a,char g,Address address){
        this.name=name;
        age=a;
        gender=g;
        this.address=address;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public char getGender(){
        return gender;
    }

    public Address getAddress(){
        return address;
    }

    public void setName(String n){
        this.name=n;
    }

    public void setAge(int a){
        this.age=a;
    }

    public void setGender(char g){
        this.gender=g;
    }

    public void setAddress(Address add){
        this.address=add;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

}
