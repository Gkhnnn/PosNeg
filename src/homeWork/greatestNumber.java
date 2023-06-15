package homeWork;

public class greatestNumber {
    public static int greatestNumber(int num1, int num2 , int num3 ){
        int enBuyukSayi;
        if(num1>num2&&num1>num3){
            enBuyukSayi = num1;
        }else if(num2>num3){
            enBuyukSayi = num2;
        }else {
            enBuyukSayi = num3;
        }
        return enBuyukSayi;
    }
    public static void main(String []args ){

        System.out.println(greatestNumber(10, 13, 5));
    }
}
