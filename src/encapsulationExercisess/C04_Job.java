package encapsulationExercisess;

public class C04_Job {
    String title;
    String company;
    double salary;

    public C04_Job() {
        this.title = "undefined";
        this.company = "undefined";
    }

    C04_Job(String title){
        this.title = title;
    }
    C04_Job (String title , String company ,double salary){
        this.title = title;
        this.company = company;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "C04_Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
