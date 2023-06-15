package day13;

public class NestedIf {
    public static void main(String[] args) {
        int num=100;

        //lets print then num can divided to 6 - 2and 3
        // while checking this req, aşso print if number is
        // even and also is not multiply of 3
        if(num%2==0){
            System.out.println("Number can devided to 6! !");
            if (num%3==0){
                System.out.println("Number can devided to 6! !");

            }
        }
    }
}
