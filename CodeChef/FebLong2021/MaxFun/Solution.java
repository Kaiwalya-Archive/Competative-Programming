package MaxFun;
import java.util.*;
public class Solution
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
        int ans[] = new int[t];
        for(int x=0; x < ans.length; x++){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0; i<arr.length ;i++){
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i=0; i<arr.length; i++){
                if(i == arr.length-1){
                    if((arr[i] - arr[0]) < 0){
                        sum += (arr[0] - arr[i]);
                    }else{
                        sum += (arr[i] - arr[0]);
                    }
                }else{
                    if((arr[i] - arr[i+1]) < 0){
                        sum += (arr[i+1] - arr[i]);
                    }else{
                        sum += (arr[i] - arr[i+1]);
                    }
                }

            }

            // System.out.println(sum);
            ans[x] = sum;
        }

        for(int i=0;i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
