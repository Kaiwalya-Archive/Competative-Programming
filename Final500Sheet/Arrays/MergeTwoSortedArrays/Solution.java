package Final500Sheet.Arrays.MergeTwoSortedArrays;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array1[] = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int array2[] = new int[m];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println("Before Sorting: ");
        print(array1);
        print(array2);
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i]>array2[j]){
                    swap(i,j,array1,array2);
                    Arrays.sort(array2);
                }
            }
        }

        System.out.println("After Sorting: ");
        print(array1);
        print(array2);
    }

    //Swapping the elements
    public static void swap(int i, int j, int[] array1, int[] array2){
        int temp = array1[i];
        array1[i] = array2[j];
        array2[j] = temp;
    }

    //Printing the array
    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
