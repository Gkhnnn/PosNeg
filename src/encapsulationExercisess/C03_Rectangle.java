package encapsulationExercisess;

public class C03_Rectangle {
    private double lenght;
    private double breadth;

    public C03_Rectangle(double lenght, double breadth) {
        this.lenght = lenght;
        this.breadth = breadth;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double area (){
        return lenght*breadth;
    }
}
