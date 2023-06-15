package practiseIT;

public class String2 {
    public static void main(String[] args) {
        String str = "catxdogxdogxca";
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i,i+3).equals("cat")){
                cat++;
            }
            if(str.substring(i,i+3).equals("dog"))
            dog++;
        }
        if(cat==dog){
            System.out.println(true);
        }else
        System.out.println(false);
    }
}
