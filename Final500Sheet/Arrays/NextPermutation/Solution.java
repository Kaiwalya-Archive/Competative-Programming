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
        for (int i = array.length-2; i >= 0; i--) {
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
                break;
            }
        }

        //swapping index1 and index2 in the the array
        swap(array, index1, index2);

        //reversing the specific portion of the array
        reverse(array, index1);

        //Printing the next permutation
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    //Function to swap the indexes in the array
    public static void swap(int[] array, int ind1, int ind2){
        int temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    //Reversing the specific portion of the array
    public static void reverse(int[] array, int ind1){
        int j = array.length-1;
        for (int i = ind1+1; i < array.length; i++) {
            if(i>=j){
                break;
            }
            swap(array,i,j);
            j--;
        }
    }
}

//Test Case: 5 1 3 5 4 2