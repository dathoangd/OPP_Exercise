package JavaCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainCollection {


    public static void main(String[] args) {

   /*     List<Person> persons = Arrays.asList(
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
*/
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Vinh", "Vietnam", 28));
        persons.add(new Person("Lan", "Vietnam", 24));
        persons.add(new Person("John", "USA", 27));
        persons.add(new Person("Lee", "China", 67));
        persons.add(new Person("Kim", "Korea", 22));
        persons.add(new Person("Long", "Vietnam", 18));
        persons.add(new Person("Tian", "China", 20));
        persons.add(new Person("Clara", "USA", 40));
        persons.add(new Person("Mikura", "Japan", 27));
        persons.add(new Person("Sony", "Japan", 29));
        persons.add(new Person("Xiang", "China", 78));
        persons.add(new Person("Peter", "France", 18));
        persons.add(new Person("Haloy", "Malaysia", 20));
        persons.add(new Person("Magie", "Malaysia", 32));


        System.out.println("Đếm số người theo từng quốc tịch in ra màn hình");
        HashMap<String, Integer> countPeopleByCountry = new HashMap<>();
        persons.forEach(person -> {
            countPeopleByCountry.merge(person.getNationality(), 1, Integer::sum);
        });

        for (Map.Entry<String, Integer> entry : countPeopleByCountry.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        System.out.println("Ex2: Sắp xếp theo tên những người trên 25 tuổi rồi in ra màn hình ");
        //Show person age > 25 and sort
        persons.sort(new Person.AgeComparator());
        for (Person person : persons) {
            if (person.age > 25) {
                System.out.println(person);
            }
        }

        System.out.println("Ex4: In ra màn hình đánh giá tuổi mỗi người");
        /*< 20 tuổi: nổi loạn
        20 đến 30 tuổi: việc làm
        31 đến 40 tuổi: sự nghiệp
        41 trở lên: hưởng thụ*/
        String str;
        for (Person p1 : persons) {
            if (p1.age < 20) {
                str = " - Tuổi nổi loạn";
            } else if (p1.age <= 30) {
                str = " - Tuổi việc làm";
            } else if (p1.age <= 40) {
                str = " - Tuổi sự nghiệp";
            } else {
                str = " - Tuổi hưởng thụ";
            }
            System.out.println(p1 + str);
        }
    }
}
