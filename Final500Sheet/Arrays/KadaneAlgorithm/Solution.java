package Final500Sheet.Arrays.KadaneAlgorithm;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if(sum+array[i] >0){
                sum += array[i];
                if (sum>max){
                    max = sum;
                }
            }else{
                sum=0;
            }
        }

        System.out.println(sum);
    }
}
