package Final500Sheet.Arrays.KthMaxAndMinOfArray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int answer[] = new int[test];
        for (int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int array[] = new int[n];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }
            int kSmall = sc.nextInt();
            Arrays.sort(array);
            answer[i] = array[kSmall-1];
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
