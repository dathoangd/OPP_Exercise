package JavaCollection;

import java.util.*;

public class Person{
    String name;
    String nationality;
    int age;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", age=" + age +
                '}';
    }
    static class AgeComparator implements Comparator<Person> {
        public int compare(Person s1, Person s2) {
            if (s1.age == s2.age)
                return 0;
            else if (s1.age > s2.age)
                return 1;
            else
                return -1;
        }
    }


}
