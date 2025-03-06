package section5.lesson47.CodingEx41;

import java.util.*;

// TODO: implement the Comparator<Person> interface in the PersonNameComparator class to sort by name
public class PersonNameComparator implements Comparator<Person> {

    // TODO: override the 'public int compare(Person o1, Person o2)' method to compare Persons by name
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

