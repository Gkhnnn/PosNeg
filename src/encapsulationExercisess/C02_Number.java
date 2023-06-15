package encapsulationExercisess;

public class C02_Number {
    private int number;
    public int getNumber(){

        return number;
    }
    public void setNumber(int number){
        if(number>0){
            this.number = number ;
        }else{
            System.out.println("Number verecegin deger sıfırdan büyük olmalı.");
        }


    }
}
