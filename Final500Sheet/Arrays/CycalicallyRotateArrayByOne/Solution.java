package Final500Sheet.Arrays.CycalicallyRotateArrayByOne;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int temp = array[array.length-1];
        shift(array);
        array[0] = temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void shift(int[] array){
        int l = array.length;
        for (int i = l; i >=2; i--) {
            array[i-1] = array[i-2];
        }
    }
}
//Test case:
/*
5
2 8 9 6 11
*/