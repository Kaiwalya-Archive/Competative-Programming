package Final500Sheet.Arrays.CountPairsWithGivenSum;
import java.util.Arrays;
import java.util.Scanner;

public class SortingSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int count = 0;
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int s = array[start] + array[end];

            if (s == k) {
                count++;
            } else if (s > k) {
                end--;
            } else {
                start++;
            }
        }
        System.out.println(count);
    }

}
