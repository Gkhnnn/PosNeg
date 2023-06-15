package ExercisessTwo;

public class C07_Swap {
    public static void main(String[] args) {
        int num = 10;
        int sayi = 20;
        num = num + sayi;
        sayi = num - sayi;
        num = num - sayi;
        System.out.println("sayi = " + sayi);
        System.out.println("num = " + num);


        String object1 = "Sana dün bir tepeden baktım aziz Java";

        System.out.println(object1.indexOf("S", object1.indexOf("S") + 1));
        System.out.println(object1.indexOf("a", object1.indexOf("a") + 3));

        String str = "50000 kişi bunu beğendi.Arkadaşarın arasında ilk sen ol.";

        String newStr = "";

        for (int i = 0; i < str.indexOf("k") - 1; i++) {
            newStr += str.charAt(i);
        }
        System.out.println("newStr = " + newStr);

        // iter for each loop olusturmak için kısa yol olarak kullanılabilir.
        // itar for loop olusturmak için kısa yol olarak kullanılabilir.

        // empty ile null aynı degildir bunların karıstırılmaması lazım!!!


        String str1 = "Four score and seven yaers ago";

        System.out.println(str1.indexOf(' '));
        System.out.println(str1.indexOf(' ', str1.indexOf(' ') + 1));
        String sentec = str1.substring(str1.indexOf(' ') + 1, str1.indexOf(' ', str1.indexOf(' ') + 1));
        System.out.println(sentec.toUpperCase());

        String sentec1 = str1.substring(0, str1.indexOf(' '));
        int sentec2 = str1.indexOf("seven ");
        int sentec3 = str1.indexOf(" ago");
        System.out.println("sentec1 = " + sentec1);
        System.out.println("sentec2 = " + sentec2);
        System.out.println(sentec3);
        System.out.println(sentec1.toLowerCase().charAt(0));
        sentec1=sentec1.replace('F', 'f');
        String kelime = sentec1.concat(str1.substring(20,26));
        System.out.println("kelime = " + kelime);

    }
}
