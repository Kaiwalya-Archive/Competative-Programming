package Final500Sheet.Arrays.MissingNumberInArray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input Essential Data from the user.
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //Main Logic
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(sum+1==array[i]){
                sum+=1;
            }
            else{
                System.out.print(i+1+" ");
                break;
            }
        }
    }
}
