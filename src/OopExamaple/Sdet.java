package OopExamaple;

public class Sdet {
    String name;
    int age;
    String gender;
    String company;
    int salary;
    boolean isSuccesful;

    public int increaseSalary(int raiseAmount) {
       this.salary +=raiseAmount;
       return this.salary;
    }

    public String companyChange(String newCompany) { // burada this kullanım amacı parametreyle instance variable aynı oldugu zaman javanın hangisinin hangisi oldugunu anlamak için kullanıyoruz...
        this.company = newCompany;                    // eger this bırakılmazsa java öce lokal variable olan parametreyi kullanır.
        return this.company;
    }

    public Sdet(String name, int age, String gender, String company, int salary, boolean isSuccesful) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccesful = isSuccesful;

    }
}
