package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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

        ArrayList<Person> ps = new ArrayList<>();
        ps.add(new Person("Vinh", "Vietnam", 28));
        ps.add(new Person("Lan", "Vietnam", 24));
        ps.add(new Person("John", "USA", 27));
        ps.add(new Person("Lee", "China", 67));
        ps.add(new Person("Kim", "Korea", 22));
        ps.add(new Person("Long", "Vietnam", 18));
        ps.add(new Person("Tian", "China", 20));
        ps.add(new Person("Clara", "USA", 40));
        ps.add(new Person("Mikura", "Japan", 27));
        ps.add(new Person("Sony", "Japan", 29));
        ps.add(new Person("Xiang", "China", 78));
        ps.add(new Person("Peter", "France", 18));
        ps.add(new Person("Haloy", "Malaysia", 20));
        ps.add(new Person("Magie", "Malaysia", 32));


        // Collections.sort(ArrayList);
        // persons.forEach(System.out::println);
        /*int count = 0;
        for (Person person : persons){
            if (person.age> 25){
                //Collections.sort(person.age);
                System.out.println(person);
            }
        }*/

        ps.sort(new Person.AgeComparator());
        

    }
}
