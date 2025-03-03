package section4.lesson38.CodingEx34;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("123 Main St",  "Springfield");
        Person person1 = new Person("John Doe", address1);

        System.out.println(person1.getName() + "\t" + person1.getAddress());

        Address address2 = new Address("456 Elm St",  "Shelbyville");
        Employee employee1 = new Employee("Jane Smith", address2, "E12345");

        System.out.println(employee1.getName() + "\t" + employee1.getAddress() + "\t" + employee1.getEmployeeId());
    }
}
//Advanced Inheritance and Polymorphism - "composition" and "inheritance"
//In this exercise, you will create a Person class that uses composition and an Employee class that uses inheritance. The Person class will have an Address object and a name. The Employee class will extend the Person class and add an employee ID.
//
//Address Class:
//
//Add a method named getFullAddress that returns the full address as a single string. This method should concatenate the street and city fields, separated by a comma and a space.
//
//Person Class:
//
//Define a private field called name (String type).
//
//Define a private field called address (Address type).
//
//Define a constructor (name, address).
//
//Add a method named getName that returns the name of the person.
//
//Add a method named getAddress that returns the full address of the person. This method should call the getFullAddress method of the address object.
//
//Employee Class:
//
//Make sure Employee extends Person.
//
//Call super constructor with (name, address) in the first line of the Employee constructor.
//
//Add a method named getEmployeeId that returns the employee ID.
//
//Expected outputs:
//
//For a Person object with name "John Doe" and address "123 Main St, Springfield":
//
//getName should return "John Doe".
//
//getAddress should return "123 Main St, Springfield".
//
//For an Employee object with name "Jane Smith", address "456 Elm St, Shelbyville", and employee ID "E12345":
//
//getName should return "Jane Smith".
//
//getAddress should return "456 Elm St, Shelbyville".
//
//getEmployeeId should return "E12345".