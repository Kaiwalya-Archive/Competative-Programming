package Final500Sheet.Arrays.BuyAndSellStocks;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int min = 10000000;
        int prof = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){//finds the minimum value of the stock
                min = array[i];
            }else if(array[i]-min >0 && array[i]-min>prof){//finds the max profit
                prof = array[i]-min;
            }
        }

        System.out.println(prof);//Printing the maximum profit
    }
}

//test cases: 6 7 1 5 3 6 4