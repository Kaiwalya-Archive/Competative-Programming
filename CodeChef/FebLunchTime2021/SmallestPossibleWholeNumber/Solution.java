//package SmallestPossibleWholeNumber;
import java.util.*;
public class Solution
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];
        for(int i = 0; i < ans.length; i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            while(n >= k){
                n = n-k;
            }
            ans[i] = n;
        }
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}
