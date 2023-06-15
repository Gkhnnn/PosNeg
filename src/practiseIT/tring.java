package practiseIT;

public class tring {
    public static void main(String[] args) {
        String a = "Hiabc";
        String b = "abc";

        a = a.toLowerCase();
        b = b.toLowerCase();
        int newA = a.length();
        int newB = b.length();

        if (newA < newB) {
            String temp = b.substring(newB - newA, newB);
            if (temp.compareTo(a) == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        } else {
            String temp = a.substring(newA - newB, newA);
            if (temp.compareTo(b) == 0) {
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }

    }
}
