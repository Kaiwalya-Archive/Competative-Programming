/*
* This is the brute-force solution. And in this we will compare every element in the ar
*/
package Final500Sheet.Arrays.CountPairsWithGivenSum;
import java.util.*;
public class BruteforceSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int pairs = findPairs(array,k);//counts the number of pairs
        System.out.println(pairs);
    }
    public static int findPairs(int[] array, int k){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==k){
                    count++;
                }
            }
        }
        return count;
    }
}
