package encapsulationExercisess;

public class C03_RectangleTest {
    public static void main(String[] args) {
        C03_Rectangle rectangle = new C03_Rectangle(1,23);
        System.out.println("rectangle.area() = " + rectangle.area());
        rectangle.setBreadth(2);
        rectangle.setLenght(3);
        System.out.println("rectangle.getBreadth() = " + rectangle.getBreadth());
        System.out.println("rectangle.getLenght() = " + rectangle.getLenght());
        System.out.println("rectangle.area() = " + rectangle.area());
    }

}
