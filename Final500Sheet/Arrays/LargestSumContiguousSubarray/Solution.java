package Final500Sheet.Arrays.LargestSumContiguousSubarray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking the essential Inputs from the user
        int n = sc.nextInt();
        int array[]  = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //Setting default values
        int sum = 0;
        int max = array[0];

        //Main Logic
        for (int i = 0; i < array.length; i++) {
            if(sum+array[i]>0){
                sum += array[i];
                if(sum>max){
                    max = sum;
                }
            }
            else{
                sum=0;
            }
        }

        System.out.println(max);
    }
}
/*Test Cases
* 9 -2 1 -3 4 -1 2 1 -5 4
* */