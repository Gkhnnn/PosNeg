package StringClasses;

import java.util.Scanner;

public class C04_StringClassesEmoji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen duygunuzu ifade eden bir emoji giriniz = ");
        String emoji = scan.nextLine();
        String str = "";
        if (emoji.length() == 2) {
            System.out.println("Valid");

        } else {
            System.out.println("İnvalid");

        }
        switch (emoji) {
            case ":)":
                System.out.println("Smile");
                break;
            case ":(":
                System.out.println("Sad");
                break;
            case ":/":
                System.out.println("Upset");
                break;
            case ":p":
                System.out.println("Playfull");
                break;
            case ";)":
                System.out.println("Wink");
                break;
            case ";0":
                System.out.println("Surprised");
                break;
            default:
                System.out.println("TAnımlanmamıs bir ifade girdiniz lütfen takrar deneyim!!!!");
        }
        control();
    }
    public static void control(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Emoji giriniz= ");
        String emoji = scan.nextLine();
        if(emoji.length()!=2){
            System.out.println("İnvalid");
            return;
        }
        char firstCharacter = emoji.charAt(0);
        char secondCharacter = emoji.charAt(1);

        if(firstCharacter==':'){
            if(secondCharacter==')'){
                System.out.println("Smile");
            } else if (secondCharacter=='(') {
                System.out.println("Sad");                
            }else if (secondCharacter=='/'){
                System.out.println("Upset");
            } else if (secondCharacter=='p') {
                System.out.println("Playfull");
            } else {
                System.out.println("Unkown");
            }
        } else if (firstCharacter==';') {
            if (secondCharacter==')'){
                System.out.println("Wink");
            } else if (secondCharacter=='0') {
                System.out.println("Surprised");
            }else {
                System.out.println("Unkown");
            }
        }
    }
}
