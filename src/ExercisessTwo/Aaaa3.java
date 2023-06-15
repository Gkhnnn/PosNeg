package ExercisessTwo;

public class Aaaa3 {
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,2,2};
        int number=  frequency(arr,1);
        System.out.println(number);
    }
    public static int frequency(int[]arr, int number){
        int count =0 ;
        for (Integer ecah : arr) {
            if(ecah.equals(number)){
                count++;
            }
        }
        return count;
    }
}
