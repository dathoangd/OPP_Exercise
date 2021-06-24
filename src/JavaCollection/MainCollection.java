package JavaCollection;

import java.util.Arrays;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("Vinh", "Vietnam", 28),
                new Person("Lan", "Vietnam", 24),
                new Person("John", "USA", 27),
                new Person("Lee", "China", 67),
                new Person("Kim", "Korea", 22),
                new Person("Long", "Vietnam", 18),
                new Person("Jungho", "Korea", 19),
                new Person("Tian", "China", 20),
                new Person("Clara", "USA", 40),
                new Person("Mikura", "Japan", 27),
                new Person("Sony", "Japan", 29),
                new Person("Xiang", "China", 78),
                new Person("Peter", "France", 18),
                new Person("Haloy", "Malaysia", 20),
                new Person("Magie", "Malaysia", 32));
       // persons.forEach(System.out::println);
        int count = 0;
        for (Person person : persons){
            if (person.age> 25){
                System.out.println(person);
            }
        }

    }
}
