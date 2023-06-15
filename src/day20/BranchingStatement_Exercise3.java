package day20;

public class BranchingStatement_Exercise3 {
    public static void main(String[] args) {
        int start = 12;
        int sum = 0;
        do{
            if(start%2==0){
                continue;
            }
            sum+=start;
        }while(++start<=10);
        System.out.println(sum);
    }
}
