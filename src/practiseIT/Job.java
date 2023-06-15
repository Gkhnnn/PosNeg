package practiseIT;

public class Job {
    private String title;
    private String company;
    private double salary;

    public Job (){
        System.out.println("N0-arg constructors.");
        this.title="undefined";
        this.company="undefined";
    }
    public Job(String title){
        System.out.println("One-arg constructors");
        this.title = title;
        this.company="undefined";
    }
    public Job(String title, String company, double salary){
        System.out.println("Three-arg constructors");
        setTitle(title);
        setCompany(company);
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        // condition
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        // condition
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
        return "Job{" +
                "title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                '}';
    }
}
