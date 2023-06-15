package practiseIT;

import java.util.Arrays;

import static java.lang.Character.isAlphabetic;
import static java.lang.Character.isDigit;

public class A3 {
    public static void main(String[] args) {
        String str = "$ASDFGHJKLQWERTYU®IMNBVCXSERTYcba½§";
        String input1 =sortLetterAndNumbers(str);
        System.out.println(input1);

    }

    public static String sortLetterAndNumbers(String input) {
        String sInput = "";
        for (int i = 0; i < input.length(); i++) {
            sInput += "" + input.charAt(i);
            if (i < input.length() - 1) {
                if ((isAlphabetic(input.charAt(i)) && isDigit(input.charAt(i + 1))) ||
                        (isDigit(input.charAt(i)) && isAlphabetic(input.charAt(i + 1)))) {
                    sInput += "-";
                }
            }
        }
        System.out.println(sInput);
        String[] sInputArry = sInput.split("-");
        System.out.println(Arrays.toString(sInputArry));
        String returnStr="";
        for (String eachString : sInputArry) {
            String[] split =  eachString.split("");
            Arrays.sort(split);
            for (String str :split){
                returnStr += str;
            }
        }
        return returnStr;

    }
}
