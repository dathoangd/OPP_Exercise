package OOP_Exercise2;

public class SchoolMember {

    public static School student() {
        School school = new School("Vinshool", "123 Minh Khai", "VS.ST");

        school.addPerson(new Person("Nguyen Van A", "Nam Dinh", "VS.ST.01", Role.STUDENT));
        school.addPerson(new Person("Hoang Thi B", "Ha Noi", "VS.ST.444", Role.NEWBIE));
        school.addPerson(new Person("Le Thi C", "Da Nang", "VS.ST.44", Role.OLDSTUDENT));
        return school;
    }

    public static School staff() {
        School school = new School("VinSchool", "123 Minh Khai", "VS.STAFF");

        school.addPerson(new Person("NGuyen Dinh Thi", "Ha Noi", "VS.STAFF.444", Role.ACCOUNTANT));
        school.addPerson(new Person("Luong Manh Hai", "Ha Noi", "VS.STAFF.84", Role.SECURITY));
        school.addPerson(new Person("Hoang Thi B", "Ha Noi", "VS.STAFF.66", Role.RECUTER));

        return school;
    }

    public static School teacher() {
        School school = new School("VinSchool", "123 Minh Khai", "VS.TEACHER");

        school.addPerson(new Person("Hoang To Nu", "Ha Noi", "VS.TEACHER.444", Role.TEACHERFULLTIME));
        school.addPerson(new Person("Tran Tuan Tu", "Ha Noi", "VS.TEACHER.444", Role.TEACHERPARTTIME));
        school.addPerson(new Person("Thi Thi", "Ha Noi", "VS.TEACHER.444", Role.TEACHERSUPPORT));

        return school;
    }
}
