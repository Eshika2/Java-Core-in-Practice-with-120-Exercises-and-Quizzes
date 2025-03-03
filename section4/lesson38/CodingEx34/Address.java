package section4.lesson38.CodingEx34;

public class Address {

    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // TODO: Add a method named 'getFullAddress' that returns the full address as a single string.
    //  This method should concatenate the 'street' and 'city' fields, separated by a 'comma and a space'.
    public String getFullAddress() {
        return street + ", " + city;
    }
}

