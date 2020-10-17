package Final500Sheet.Arrays.UnionOfArray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int set1[] = new int[n];
        for (int i = 0; i < set1.length; i++) {
            set1[i] = sc.nextInt();
        }
        int set2[] = new int[m];
        for (int i = 0; i < set2.length; i++) {
            set2[i] = sc.nextInt();
        }
        boolean repeated[] = new boolean[set2.length];
        
        int length = set1.length+ set2.length;
        //checking the union
        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if(set1[i]==set2[j]){
                    length--;
                    repeated[j]=true;
                }
            }
        }

        System.out.println("Length is : "+length);
        for (int i = 0; i < set1.length; i++) {
            System.out.print(set1[i]+" ");
        }
        for (int i = 0; i < set2.length; i++) {
            if(repeated[i]==false){
                System.out.print(set2[i]+" ");
            }
        }
    }
}
//test cases: 5 3 2 8 5 9 6 3 2 1