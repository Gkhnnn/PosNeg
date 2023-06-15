package LogicalOperatorsCalismalari;

public class LogicalOperatorsExercises {
    public static void main(String[] args) {

        /*Sincaplar bir parti için bir araya geldiklerinde puro içmeyi severler.
        Puro sayısı 40 ile 60 arasında olduğunda bir sincap partisi başarılı olur.
        Hafta sonu olmadığı sürece, bu durumda puro sayısında üst sınır yoktur.
         Verilen değerlere sahip taraf başarılıysa true veya başka türlü false döndürün.

         */
        int puro = 61;
        boolean haftasonu = false;
        boolean haftaiçi = true;

        if (puro > 40 && puro < 60 && haftasonu != haftaiçi) {
            System.out.println("parti basarılı");

        } else {
            System.out.println("parti basarısız.");
        }
        /*Siz ve randevunuz bir restoranda masa almaya çalışıyorsunuz.
        "Siz" parametresi, 0..10 aralığında kıyafetlerinizin şıklığıdır ve
        "tarih", randevunuzun kıyafetlerinin şıklığıdır.
         Tabloyu alan sonuç, 0=hayır, 1=belki, 2=evet ile bir int değeri olarak kodlanır.
         İkinizden biri çok şıksa, 8 veya daha fazlaysa, sonuç 2'dir (evet).
          İstisna, ikinizden birinin stili 2 veya daha azsa, sonuç 0'dır (hayır).
            Aksi takdirde sonuç 1'dir (belki).
            dateFashion(5, 10) → 2
dateFashion(5, 2) → 0
dateFashion(5, 5) → 1
 */
        int you = 5;
        int date =5;
        boolean sonuc = (you % date == 0 || you % date == 1 || you % date == 2);
        if(sonuc){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
