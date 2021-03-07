package NoTimeToWait;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//Instances of time
        int h = sc.nextInt();//Time taken to solve the problem (in general)
        int x = sc.nextInt();//Time left in present
        int arr[] = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        //Main Solution
        int flag = 0;
        for(int i = 0; i < arr.length; i++){
            if(x + arr[i] >= h){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}
