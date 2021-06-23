package OOP_Exercise2;

public class ShowSchool {
    public static void main(String[] args) {

        School student = SchoolMember.student();
        student.listPerson();

        School staff = SchoolMember.staff();
        staff.listPerson();

        School teacher = SchoolMember.teacher();
        teacher.listPerson();

    }
}
