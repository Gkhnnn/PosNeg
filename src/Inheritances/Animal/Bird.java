package Inheritances.Animal;

public class Bird extends Animal{
    public Bird(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println("Ben genelde tohum yerim..");
    }

    @Override
    public void makeSound() {
        System.out.println("Cik...cik..cik");
    }
    public void fly(){
        System.out.println("I am flying");
    }
}
