package OOP_Exercise2;

public class Person {
    private String name;
    private String address;
    private String code;
    private Role role;

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + ", code_no=" + code + ", Role=" + role + "]";
    }

    public Person(String name, String address, String code, Role role){
        this.name = name;
        this.address = address;
        this.code = code;
        this.role = role;
    }

}
