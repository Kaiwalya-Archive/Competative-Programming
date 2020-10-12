package HackerRank.SubArrrayDivision;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();


//        if(n>1){
//            for (int i = 0; i <= n-(m-1); i++) {
//                int res = arr[i];
//                for(int j=i+1; j<=m-1; j++){
//                    res += arr[j];
//                }
//                if(res==d){
//                    pair++;
//                }
//            }
//        }
//        else{
//            if(arr[0] == d){
//                pair++;
//            }
//        }
        int pair = solve(n, arr, d, m);
        System.out.println(pair);
    }
    static int solve(int n, int[] s, int d, int m){
        int total=0;
        for (int i=0;i<=n-m;i++){
            if(Arrays.stream(s, i, i+m).sum() == d)
                total++;
        }
        return total;
    }
}
