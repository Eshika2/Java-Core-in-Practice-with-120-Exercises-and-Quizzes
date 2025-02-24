package section4.lesson31.CodingEx23;

public class Employee {
    // TODO: Declare a public field for name (String)
    public String name;
    // TODO: Declare a private field for salary (double)
    private double salary;
    // TODO: Declare a field with default access modifier for department (String)
    String department;


    // TODO: Implement a public method to display employee details
    /*
        Format:

        Name: [name]
        Salary: [salary]
        Department: [department]
    */
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    // TODO: Implement a getter for private field salary
    public double getSalary() {
        return salary;
    }
    // TODO: Implement a setter for private field salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
