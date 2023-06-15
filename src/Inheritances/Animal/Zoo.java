package Inheritances.Animal;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        System.out.println("Welcome to Ali Baba Zoo");
        Dog kopek1 = new Dog("Karabas",5,"Blaack");
        Bird kus1 = new Bird("Cici Kuş",2,"Yellow");
        Fish balik1 = new Fish("Nemo",4,"Purple");
/*
        kopek1.eat();
        kopek1.movie();
        kopek1.makeSound();

        balik1.eat();
        balik1.swim();
        balik1.makeSound();

        kus1.eat();
        kus1.makeSound();
        kus1.fly();


 */
        ArrayList<Animal> hayvanatBahcesi = new ArrayList<>();
        hayvanatBahcesi.add(kopek1);
        hayvanatBahcesi.add(kus1);
        hayvanatBahcesi.add(balik1);

        for (Animal animal : hayvanatBahcesi) {
            System.out.print(animal.getClass().getSimpleName().toUpperCase()+"-");
            System.out.println(animal.getName());
            animal.makeSound();
            animal.eat();
            if(animal instanceof Bird){

                ((Bird) animal).fly();
            }
            if (animal instanceof Fish) {
                ((Fish) animal).swim();
            }

        }
    }
}
