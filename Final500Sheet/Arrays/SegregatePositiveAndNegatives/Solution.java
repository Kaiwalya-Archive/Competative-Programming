package Final500Sheet.Arrays.SegregatePositiveAndNegatives;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int i = 0;
        int j = array.length-1;

        for (int k = 0; k < array.length; k++) {
            if(array[i]<0 && i<j){
                i++;
            }else{
                if(array[j]<0){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }else{
                    j--;
                }
            }
        }

        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k]+" ");
        }
    }

}
