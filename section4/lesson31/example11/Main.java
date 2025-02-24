package section4.lesson31.example11;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
