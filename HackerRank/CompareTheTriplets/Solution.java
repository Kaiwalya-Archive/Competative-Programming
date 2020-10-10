package HackerRank.CompareTheTriplets;
import java.util.*;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        int alice = 0;
        int bob = 0;
        int result[] = new int[2];
        for(int i=0 ;i<a.length; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0 ;i<a.length; i++){
            b[i] = sc.nextInt();
        }

        for(int i=0; i<a.length; i++){
            if(a[i]>b[i]){
                alice++;
            }else if(a[i] < b[i]){
                bob++;
            }
        }
        result[0] = alice;
        result[1] = bob;
        for(int i=0; i< result.length; i++){
            System.out.print(result[i]+" ");
        }
    }
}
