package Constructors;

import java.util.ArrayList;

public class Course {
    String courseName;

    int courseCapacity;
    int emptyCapacity;

    ArrayList<Student> studentList = new ArrayList<>();

    public Course(String courseName, int courseCapacity) {
        this.courseName = courseName;
        this.courseCapacity = courseCapacity;

    }

    public void studentAdd(Student student) {
        if (this.courseCapacity == this.emptyCapacity) {
            System.out.println("Course kapasitesi dolmustur.");
        } else {
            studentList.add(student);
            this.emptyCapacity = studentList.size();
            System.out.println(student.name + " isimli " + student.country + " ülkeden " + student.city + " sehirden  ile kursumuza kayıt edilmiştir.");
        }
        System.out.println("Course şuanda " + studentList.size() + " kayıtlı student bulunmaktadır.");
    }

    public void studentList() {
        System.out.println(this.courseName + " kayıtlı student listesi.");
        System.out.println("-----------------------------------------");
        for (Student student : this.studentList) {
            System.out.println(student);
        }
    }

    public boolean isTheCourseFull() {

        if (studentList.size() == this.emptyCapacity) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String str = "";
        str += "Course name                      : " + this.courseName + "\n";
        //str += "Course adres                     : " + this.courseAdress + "\n";
        str += "Course capacity                  : " + this.courseCapacity + "\n";
        str += "Course empty                     : " + this.emptyCapacity + "\n";
        str += "Course kayıtlı student listesi   : " + studentList;
        return str;
    }

}
