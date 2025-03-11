package section5.lesson47.CodingEx41

import java.util.*;

// TODO: implement the Comparable<Person> interface in the Person class to sort by age
public class Person implements Comparable <Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // TODO: override the 'public int compareTo(Person other)' method to compare Persons by age
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.getAge());
    }
}
