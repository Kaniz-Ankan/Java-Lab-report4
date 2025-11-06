  class Person {

    private String name;
    private int age;
    private String gender;
    private String address;

    public Person() {
        this("Unknown", 0, "Unknown", "Unknown");
    }

    public Person(String name, int age) {
        this(name, age, "Unknown", "Unknown");
    }

    public Person(String name, int age, String gender) {
        this(name, age, gender, "Unknown");
    }

    public Person(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Person: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address);
    }


    public void updateDetails(String address) {
        this.address = address;
        System.out.println("Updated address: " + this.address);
    }

    public void updateDetails(int age) {
        this.age = age;
        System.out.println("Updated age: " + this.age);
    }

    public void updateDetails(int age, String address) {
        this.age = age;
        this.address = address;
        System.out.println("Updated age: " + this.age + ", Updated address: " + this.address);
    }
}

public class MainPerson{
public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person("Anika", 25);
    Person p3 = new Person("Bobita", 30, "Female");
    Person p4 = new Person("Sonia", 28, "Female", "Dhaka");

    p1.displayInfo();
    p2.displayInfo();
    p3.displayInfo();
    p4.displayInfo();
    p4.updateDetails("Chittagong");
    p4.updateDetails(29);
    p4.updateDetails(30, "Sylhet");
}
}


