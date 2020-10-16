package Final500Sheet.Arrays.DutchFlagProblem;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                zero++;
            }else if(array[i]==1){
                one++;
            }else{
                two++;
            }
        }
        int count=0;
        for (int i = 0; i < array.length; i++) {
            while(count<zero){
                array[i] = 0;
                i++;
                count++;
            }
            count=0;
            while(count<one){
                array[i] = 1;
                i++;
                count++;
            }
            count=0;
            while(count<two){
                array[i] = 2;
                i++;
                count++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
