package Constructors;

public class CourseProgram {
    public static void main(String[] args) {
        Course course1 = new Course("EuroTech QA", 5);

        Student student1 = new Student("Ali", "London", "England");
        Student student2 = new Student("Ayse", "Istanbul", "Turkey");
        Student student3 = new Student("Hakan", "Berlin", "Germany");
        Student student4 = new Student("Fuat", "New Jersey", "USA");
        Student student5 = new Student("John", "New York", "USA");
        Student student6 = new Student("Hakkı", "Mardin", "Turkey");

        course1.studentAdd(student1);
        course1.studentAdd(student2);
        course1.studentAdd(student3);
        course1.studentAdd(student4);
        course1.studentAdd(student5);
        course1.studentAdd(student6);

        if (!course1.isTheCourseFull()) {
            course1.studentAdd(student1);
        } else
            System.out.println("Course is full. You can nat add new Student.");

        course1.isTheCourseFull();


        System.out.println("---------------------------------");

        System.out.println(course1.toString());


    }
}
