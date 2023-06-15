package homeWork;

public class convertToMile {
    public static double convertMile (double mile){
        double km= mile*1.609344;
        return km;
    }

    public static void main(String[] args) {
        double convert =convertMile(121);
        System.out.println("convert = " + convert);
    }
}
