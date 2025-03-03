package section4.lesson38.CodingEx34;

public class Person {

    // TODO: Define a 'private' field called 'name' (String type).
    private String name;
    // TODO: Define a 'private' field called 'address' (Address type).
    private Address address;
    // TODO: Define a constructor (name, address).
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    // TODO: Add a method named 'getName' that returns the name of the person.
    public String getName() {
        return name;
    }
    // TODO: Add a method named 'getAddress' that returns the full address of the person.
    //  This method should call the 'getFullAddress' method of the 'address' object.
    public String getAddress() {
        return address.getFullAddress();
    }
}

