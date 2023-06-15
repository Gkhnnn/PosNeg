package ExercisessTwo;

public class C04_YıldızSekil {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
           if(i%2==0){
               for (int j = 0; j < 5; j++) {
                   System.out.print("*");
               }
           }
            System.out.println();
        }
    }
}
