package people;

public class Person {
    private String name;
    private int age;
    private char gender;
    private long id;
    private Address address;

    public Person(String name,int a,char g,Address address){
        this.name=name;
        age=a;
        gender=g;
        this.address=address;
        id=System.currentTimeMillis();//unique value time since coordinated universal time (Jan 1 1970 midnight)
    }


    public long getId() {
        return id;
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
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

}
