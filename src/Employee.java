public class Employee {
    private String name;
    private int id;
    private double salary;
    private String designation;

    public Employee() {
        this("Unknown", 0, 0.0, "Unknown");
    }

    public Employee(String name, int id) {
        this(name, id, 0.0, "Unknown");
    }

    public Employee(String name, int id, double salary) {
        this(name, id, salary, "Unknown");
    }

    public Employee(String name, int id, double salary, String designation) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.designation = designation;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: $" + salary + ", Designation: " + designation);
    }

    public void updateDetails(double salary) {
        this.salary = salary;
        System.out.println("Salary updated to: $" + this.salary);
    }

    public void updateDetails(String designation) {
        this.designation = designation;
        System.out.println("Designation updated to: " + this.designation);
    }

    public void updateDetails(double salary, String designation) {
        this.salary = salary;
        this.designation = designation;
        System.out.println("Salary updated to: $" + this.salary + ", Designation updated to: " + this.designation);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("MD.Noman", 101);
        Employee e3 = new Employee("Elona Khan", 102, 50000.0);
        Employee e4 = new Employee("Damer Hossain", 103, 75000.0, "Manager");

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
        e4.displayInfo();
        e4.updateDetails(80000.0);
        e4.updateDetails("Senior Manager");
        e4.updateDetails(90000.0, "Director");
    }
}
