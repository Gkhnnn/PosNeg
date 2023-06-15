package Inheritances.Animal;

public class Dog extends Animal{
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Hav..Hav..");
    }

    @Override
    public void eat() {
        System.out.println("Ot yemem et yerim...");
    }
}
