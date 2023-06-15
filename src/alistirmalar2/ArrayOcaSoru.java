package alistirmalar2;

public class ArrayOcaSoru {
    public static void main(String[] args) {
       int arry [] = {1,2,3,4};
       // System.out.println(arry instanceof Object);

        char [] ch = new char [2];
        int length = ch.length;

        int arr1[] = {1,2,053,4};
        int arr2 [][] = {{1,2,4},{2,2,1},{0,4,3,2}};
       System.out.print(arr1[3] == arr2[0][2]);
        System.out.print(" "+(arr1[2]==arr2[2][1]));
    }
}
