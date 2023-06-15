package classes;

public class C01_DortIslem {

    public int topla(int number1 , int number2){
        return number1+number2;
    }
    public int cikar(int number1 , int number2){
        return number1-number2;

    }
    public int carp(int number1 ,int number2){
        return number1*number2;
    }
    public int bol(int number1, int number2){
        if(number2>0){
            return number1/number2;
        }else{
            System.out.println("Number2 sıfırdan büyük olmadıgı için işle gerceklestirilemez.");
            return number2;
        }
    }
}
