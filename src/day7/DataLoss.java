package day7;

public class DataLoss {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d= 323.48;
        b = (byte) i;
        // byte range is between -128 ... 127 and starts counting from scratch
        // b % 256= 1 // data loss
        System.out.println("integer deger i = " + i + ", byte deger b=" + b);

        // b%256 =67 // data loss =range +kusurat
        b=(byte)d;
        System.out.println("double deger d = " + d+", byte deger b= "+b);



    }
}
