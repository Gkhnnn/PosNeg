package alistirmalar1;

public class A06_TerseCevirme {
    public static void main(String[] args) {
        String str = "Java ogrenmek icin cok calismak lazim";
        String terstenStr="";

        for (int i = str.length()-1; i >=0; i--) {
            terstenStr += str.substring(i,i+1);
        }
        System.out.println("terstenStr str'ın tersten yazılmıs hali : " + terstenStr);

    }
}
