package ChefAndCoupon;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int dil = sc.nextInt();
            int coup = sc.nextInt();
            int day1[] = new int[3];
            int day1Add = 0;
            int day2[] = new int[3];
            int day2Add = 0;
            for(int i = 0; i < day1.length; i++){
                day1[i] = sc.nextInt();
                day1Add += day1[i];
            }
            for(int i = 0; i < day2.length; i++){
                day2[i] = sc.nextInt();
                day2Add += day2[i];
            }

            if(dil+coup >= 150){
                int withCoupon = (day1Add + day2Add + coup);
                int withoutCoupon = (day1Add + day2Add + dil + dil);
                if(withCoupon < withoutCoupon){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                int withCoupon = (day1Add + day2Add + coup + dil);
                int withoutCoupon = (day1Add + day2Add + dil + dil);
                if(withCoupon < withoutCoupon){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }

            }
        }
    }
}
