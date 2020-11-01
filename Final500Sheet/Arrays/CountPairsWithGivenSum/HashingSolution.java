package Final500Sheet.Arrays.CountPairsWithGivenSum;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashingSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int pairs = findPairs(array,k);//counts the number of pairs
        System.out.println(pairs);
    }
    public static int findPairs(int[] array, int k){
        Set<Integer> s = new HashSet<>();
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if(s.contains(k-array[i])){
                count++;
            }else{
                s.add(array[i]);
            }
        }
        return count;
    }
}
