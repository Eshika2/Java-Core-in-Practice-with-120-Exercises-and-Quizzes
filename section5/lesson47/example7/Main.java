package section5.lesson47.example7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Jane", 30));
        persons.add(new Person("Bob", 20));

        Comparator<Person> nameComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Collections.sort(persons, nameComparator);

        for (Person person : persons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
