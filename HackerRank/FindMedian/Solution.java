package HackerRank.FindMedian;
import java.util.*;
public class Solution {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//Taking size of array
        int arr[] = new int[n];//Making array of given size
        for(int i=0; i<n; i++){//Taking input in made array
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);//Using inbuilt function to sort the array
        int median = n/2;//Taking out the index of median
        System.out.println(arr[median]);//Printing the element at the median index

    }

}
