package Final500Sheet.Arrays.NextPermutation;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //Traversing array in reverse order and finding index1;
        int index1=0;
        for (int i = array.length-1; i >= 0; i--) {
            if(array[i]<array[i+1]){
                index1=i;
                break;
            }
        }

        //Traversing array in reverse order and finding index2
        int index2=0;
        for (int i = array.length-1; i >= 0; i--) {
            if(array[i]>array[index1]){
                index2=i;
            }
        }

        //swapping index1 and index2 in the the array
        swap(array, index1, index2);

        //reversing the specific portion of the array
        reverse(array, index1);

        //Printing the next permutation
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //Function to swap the indexes in the array
    public static void swap(int[] array, int ind1, int ind2){

    }

    //Reversing the specific portion of the array
    public static void reverse(int[] array, int ind1){

    }
}