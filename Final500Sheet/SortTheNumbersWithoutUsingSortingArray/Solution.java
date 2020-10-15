package Final500Sheet.SortTheNumbersWithoutUsingSortingArray;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int answer[] = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int check = 0;
        for(int j = 0; j< answer.length;){
            for(int i = 0; i< answer.length;i++){
                if(array[i] ==check){
                    answer[j] = array[i];
                    j++;
                }
            }
            if(check<=2){
                check++;
            }else{
                break;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }

}
