package Inheritances.Overriding;

public class Dog extends C01_Animal{

    @Override
    public void eat(){
        super.eat();// super kelimesi inherit yapılmıs bir class da kullanılır... inherit yapılmamıs bir class da kullanılamaz!!!!!
        System.out.println("Köpekler özellikle et yerler.....");
    }
}
