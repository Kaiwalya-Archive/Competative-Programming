package Final500Sheet.Arrays.MinAndMaxInTheArray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }else if(array[i]>max){
                max = array[i];
            }
        }

        System.out.println("Maximum is : "+max);
        System.out.println("Minimum is : "+min);

    }
}
