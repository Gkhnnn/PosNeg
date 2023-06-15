package homeWork;

public class CardEligibility {

    public static boolean wage(int wage){
        if(wage>4500){
            return true;
        }else{
            return false;
        }
    }
    public static void main (String [] args){
        System.out.println(wage(1000));
    }
}
