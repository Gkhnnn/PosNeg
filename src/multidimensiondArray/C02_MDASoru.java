package multidimensiondArray;

public class C02_MDASoru {
    public static void main(String[] args) {
        int[][]arr = {{1,2},{2,3,4},{4,45,5},{2,3,4}};
        elementTopla(arr);
    }
    public static void elementTopla(int[][]arry){
        int total =0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                total+=arry[i][j];
            }
        }
        System.out.println("total = " + total);
    }
}
