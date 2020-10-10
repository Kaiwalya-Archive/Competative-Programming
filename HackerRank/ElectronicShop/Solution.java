package HackerRank.ElectronicShop;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();//budget
        int k = sc.nextInt();//keyboard models
        int u = sc.nextInt();//usb models
        int[] keyboard = new int[k];//model list
        int[] usb = new int[u];//model list

        for(int i=0; i<k; i++){//Taking the prices of models
            keyboard[i] = sc.nextInt();
        }
        for(int i=0; i<u; i++){//Taking the prices of models
            usb[i] = sc.nextInt();
        }
        int finalDecision = -1;//If nothing matches the decision will be -1

        for(int i=0; i<k; i++){//Finding the appropriate pair
            for(int j=0; j<u; j++){
                if(keyboard[i]+usb[j]>finalDecision && keyboard[i]+usb[j]<=b){
                    finalDecision=keyboard[i]+usb[j];
                }
            }
        }

        System.out.println(finalDecision);
    }
}
