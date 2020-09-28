package HackerRank.BillingDivision;

import java.util.*;
public class Solution {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();//No of items in bill
        int x = sc.nextInt();//Refused that she ate it
        int bill[] = new int[items];//original bill
        for(int i=0; i<items; i++){//Taking the input of the bill
            bill[i] = sc.nextInt();
        }
        int refund = sc.nextInt();//Takes the amount refunded
        int paidSum=0;

        for(int i=0; i<items; i++){//Took the total sum
           if(x==i){
               continue;
           }else{
               paidSum +=bill[i];
           }
        }

        int perEach = paidSum/2;//Splits the bill

        if(refund-perEach == 0){
            System.out.println("Bon Appetit");//If nothing is due
        }else{
            System.out.println(refund-perEach);//If Brian has to return
        }


    }

}
