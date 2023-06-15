package Inheritances.Overriding;

public class Horse extends C01_Animal {


    @Override
    public void eat() {
        super.eat(); // super kelimesi inherit yapılan class içerinde kullanılabilir.. inherit yapılmamıs bir class da kullanılmaz...!!!!!!
        System.out.println("Atlar özellikle saman yerler......");
    }

                    /*
                    inherit baglantılarda parent yani ana baglantı sagladıgımız class ın altında
                    baglantı yaptıgımız classın access modifier'ı ana baglantı saglayıcının access modifierından
                    daha geniş olmak zorunda yoksa hata alırız.
                    yapmıs oldugumuz
                    örnekte C01_Animal 'ın acces modifierından daha geniş olmak zorunda Horse ve Dog classlarının access modifierı yoksa
                    Java hata verir.
                    */

    /*
    override işlemi ana baglantı sagladıgımız class daki methodların aynı isimle cocuk olarak nitelediğimiz classlarda da olmasıdır. ancak bu methods
    her bir cocuk classımızda farklı farklı işlemler yapar. ama ana methodumuzdaki işlemi de super(); yazarak bu cocuk classlarımız da tanımlayabiliriz
    ve kullanabiliriz.......
     */
}
