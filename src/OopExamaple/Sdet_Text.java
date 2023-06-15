package OopExamaple;

public class Sdet_Text {
    public static void main(String[] args) {
        Sdet gokhan = new Sdet("gokhan turk",31,"erkek","Amazon",79000,true);
        System.out.println(gokhan.increaseSalary(1200));
        System.out.println(gokhan.companyChange("amazon"));
        Sdet ahmet = new Sdet("ahmet can",30, "erkek","Google",90000,false);
        System.out.println(ahmet.companyChange("alibaba"));
        System.out.println(ahmet.increaseSalary(34000));
    }
}
