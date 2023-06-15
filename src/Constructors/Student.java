package Constructors;

public class Student {
    String name;
    String city;
    String country;
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }
    public Student(String name, String city) {
       this(name);
        this.city = city;
    }
    public Student(String name, String city, String country) {
        this(name,city);
        this.country = country;
    }
}
