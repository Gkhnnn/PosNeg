package Inheritances.Animal;

public class Fish extends Animal{
    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Ses çıkarırım ama sen duymazsın...");
    }
    public void swim(){
        System.out.println("Ben denzilerde yüzerim. Hatta derinlere dalarım...");
    }
}
