package ExercisessTwo;

public class C02_WhileLoop {

    public static void main(String[] args) {
        int x=0;
        int sum = 0;
        while (x<101){
            x++;
            if(x%2==0){
                sum+=x;

            }
        }
        System.out.println("sum = " + sum);
    }
}
