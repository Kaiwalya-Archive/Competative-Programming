package MaxVal;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            int max = 0;
            for(int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            //solution
            if(n > 2){
                int a = arr[0];
                int b = arr[1];
                System.out.println(a*b+a-b);
            }else{
                int a = arr[0];
                int b = arr[1];
                System.out.println(a*b+a-b);
            }
        }
    }
}
