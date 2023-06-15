package ExercisessTwo;

public class C01_ExpiclitAndImplicit {
    public static void main(String[] args) {
        byte b1 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double result = (f * b1) + (i / c) - (d * s);
        System.out.println("result = " + result);
        
        
        int r =6;
        System.out.println("r =: " + r);

        byte x;
        int a = 270;
        double b = 128.128;
        x = (byte) a;
        System.out.println("a and x "+a+" "+x);
        a = (int) b;
        System.out.println("b and a "+b+" "+a);
        x= (byte) b;
        System.out.println("b and x "+b+" "+x);


        long  l = 30;
        int i1 = 50;
        short s1 =60;
        byte  b2 = 70;
        int sum = (int)l+i1+s1+b2;
        System.out.println("sum = " + sum);


       int num1 = 0;
       int num2 = 1;
       int num3 = 1;
        for (int j = 3; j < 16; j++) {
            num1 = num2;
            num2 = num3;
            num3 = num1 + num2;
            System.out.print("num3 = " + num3 +" ");
        }
        System.out.println();
        int total =0;
        for (int j = 0; j < 200 ; j++) {
            total+=j;

        }
        System.out.println("total = " + total);
    }
}
