package homeWork;


public class C02_B7_Homework {
    public static void main(String[] args) {

        String text = "DEECGDDEEEEFGGDCDD";
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if(!result.contains(String.valueOf(text.charAt(i)))){
                result +=String.valueOf(text.charAt(i));
            }
        }
        System.out.println(result);
    }
}
