package InstanceMethodsVsVariable;

public class PenText {
    public static void main(String[] args) {
       Pen object = new Pen();

        object.color = "Blue";
        System.out.println("object.color = " + object.color);
        object.height = 12;
        System.out.println("object.height = " + object.height);
        object.price = 100;
        System.out.println("object.price = " + object.price);
        object.type = "inexhaustible";
        System.out.println("object.type = " + object.type);
        object.stockAmount = 23;
        System.out.println("object.stockAmount = " + object.stockAmount);





        PenInstanceMethods object1 = new PenInstanceMethods();


        object1.addToInventory(12);
        object1.extraction(2);
        object1.creating();

    }
}
