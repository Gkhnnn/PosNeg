package Inheritances;

public class C05_Test {
    public static void main(String[] args) {
        C01_Costumers costum = new C01_Costumers();
        costum.age=12;
        costum.idnumber=123456789;
        costum.name = "Gökhan";
        costum.lastName = "Türk";
        C02_EMployee empl = new C02_EMployee();
        empl.age = 23;
        empl.salary = 34556;
         // inheritances classlar arasında ortak özeliklere sahip objelerin degerini baska bir class store edip
         // bir den fazla tekrara düşmekten bizi kurtarır. bu sadece instance variable kullanmak için degil ayrıca ortak methods ları da bu şekilde yaparak
         // daha az code yazmaya ve olusabilecek hataları cabuk düzeltmeye yardımcı olur.
         // bir class sadece bir tane classı extends edebilir...!!!!

    }
}
