package day7;

public class ExpilicitCasting {
    public static void main(String[] args) {
        // data kaybı oldugundan dolayı bunu kendimiz yapmamız gerekiyor.
        double myDouble =9.78;
        int myInt=(int) myDouble;// expilicitCasting -Manual Conversion
        double myDouble2= myInt; // Data kaybını geri almak bu şekilde mümkün degil.
        System.out.println("myDouble = " + myDouble);
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble2 = " + myDouble2);

        double d=100.4;
        long l=(long) d;// data kaybı söz konusu
        int i= (int)l;// data kaybı söz konusu degil ama yine de otomatik yapılmıyor kendimiz maual yapmamız gerekiyor.
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        System.out.println("i = " + i);









    }
}
