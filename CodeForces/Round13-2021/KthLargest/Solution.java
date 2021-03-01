package KthLargest;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];
        int q = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        //solution
        for(int i = 0; i < q; i++){
            int t = sc.nextInt();
            if(t == 1){
                int x = sc.nextInt();
                arr[x-1] = arr[x-1] - 1;
                System.out.println(arr[x-1]);
                Arrays.sort(arr, Collections.reverseOrder());
            }else if(t == 2){
                int k = sc.nextInt();
                System.out.println(arr[k-1]);
            }
        }
    }
}
