package alistirmalar2;

public class student {
    String name;
    String surname;
    String className;
    char sinifKodu;
    String ders;
    static String okulAdı = "Yunus Emre Okulu";
    double dersNotu;
    int devamsızlık;
    int schoolNumber;
    int age;
    double weight;

    static String schoolName;

    public  double notOrtalaması(double not1,double not2){
        return not1+not2/2;
    }
    public   int devamsizlik(int gelmediğiGün){
       int devamsızlık = gelmediğiGün;
        if(devamsızlık<=20&&devamsızlık>0){
            System.out.println("devamsızlık normal");
        }else {
            System.out.println("devamsızlık fazla oldugu için sınıf tekrarı");
        }
        return devamsızlık;
    }

}
