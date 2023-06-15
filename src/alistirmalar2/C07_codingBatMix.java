package alistirmalar2;

public class C07_codingBatMix {
    public static void main(String[] args) {
        String str = "pixdel";
        String yeniStr =str.substring(1, 3);
       // System.out.println("yeniStr = " + yeniStr);
        if(str.contains(yeniStr)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
