package practiseIT;

public class A6 {
    public static void main(String[] args) {
       print(4,7);
    }

    public static void print(int rows,int cols){
        for (int i = 1; i < rows ; i++) {
            int num = i;
            System.out.print(i);
            for (int j = 1; j <=cols; j++) {
                num+=rows;
                System.out.print(", "+num);
            }

            System.out.println();
        }
    }
}
