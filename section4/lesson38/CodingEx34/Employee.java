package section4.lesson38.CodingEx34;

// TODO: Employee should extend Person
public class Employee extends Person{

    private String employeeId;

    public Employee(String name, Address address, String employeeId) {
        // TODO: call super constructor with (name, address)
        super(name, address);
        this.employeeId = employeeId;
    }

    // TODO: Add a method named 'getEmployeeId' that returns the employee ID.
    public String getEmployeeId() {
        return employeeId;
    }
}

