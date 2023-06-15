package encapsulationExercisess;

public class C05_EmployeeTest {
    public static void main(String[] args) {
        C05_Employee empl1 = new C05_Employee();
        C05_Employee empl2 = new C05_Employee("Ahmet Yıl",1234);
        C05_Employee empl3 = new C05_Employee("Gokhan Turk",1234,"Account","QA");


        empl1.setName("Ali Can");
        empl1.setIdNumber(45678);
        empl1.setDepartment("Salesforce");
        empl1.setPosition("DEV");

        empl2.setDepartment("Account");
        empl2.setPosition("QA");


        System.out.println("empl1 = " + empl1.toString());
        System.out.println("empl2 = " + empl2.toString());
        System.out.println("empl3 = " + empl3.toString());
    }
}
