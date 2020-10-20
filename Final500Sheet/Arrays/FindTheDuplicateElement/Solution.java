package Final500Sheet.Arrays.FindTheDuplicateElement;
//This solution is O(n^2) complexity

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking necesssary input from the user
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int repeated = findDuplicate(array);//Calling the function
        System.out.println(repeated);//Printing the final result
    }

    //Main logic
    public static int findDuplicate(int[] array){
        int repeated = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]==array[j]){
                    repeated = array[i];
                    return repeated;
                }
            }
        }
        return repeated;
    }
}
