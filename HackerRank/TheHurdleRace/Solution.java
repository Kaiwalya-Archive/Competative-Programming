package HackerRank.TheHurdleRace;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int height[] = new int[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            if(height[i]>=max){
                max=height[i];
            }
        }

        int result = max - k;
        if(result>0){
            System.out.println(result);
        }else{
            System.out.println("0");
        }
    }
}
