package varARGS;

public class C02_VarArgsExample {
    public static void main(String[] args) {
        findSecretKey("Bazen", "kedeler", "sessiz", "degisiklik", "yapmk", "kısmetsizliginde", "ıslanmak", "istemezsler");
    }

    public static void findSecretKey(String... arr) {
        String str = "";
        int sum = 0;
        for (String each : arr) {
            str += each.charAt(sum);
            sum++;
        }
        System.out.println(str);
    }
}
