package HackerRank.SearchTheElement;
import java.util.*;
public class Solution {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();//element to be searched
        int n = sc.nextInt();//no of elements in the array
        int arr[] = new int[n];//Array of elements
        for(int i=0; i<n; i++){//Taking the input in array
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i]==search){
                System.out.println(i);
                break;
            }
        }
    }

}
