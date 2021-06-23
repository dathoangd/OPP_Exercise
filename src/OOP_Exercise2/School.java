package OOP_Exercise2;

import java.util.ArrayList;
import java.util.List;

public class School {
    String name;
    String address;
    String code;

    private List<Person> persons = new ArrayList<>();

    public School(String name, String address, String code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void listPerson() {
        for (Person person : persons) {
            System.out.println(String.valueOf(person));
        }
    }

}
