package CollegeLife4;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->=0){
            int n = sc.nextInt();//No of students
            int e = sc.nextInt();//No of eggs
            int h = sc.nextInt();//No of chocolate bars
            int a = sc.nextInt();//$ of omelette
            int b = sc.nextInt();//$ of milkshake
            int c = sc.nextInt();//$ of cake

            //Ingrediants present
            int eggs = 1;
            int bars = 1;

            //Ingediants required
            int om = eggs * 2;
            int chocoM = bars * 3;
            int cake = eggs*1 + bars*1;

            //Main solution
            int minCost = 1000000000;
            int stud = 0;
            if(e == h){
                if(e >= n){
                    //This is first & naive distribution technique
                    if(n*c <= minCost){
                        minCost = n*c;
                    }
                    //This is second distribution technique
                    int temp = e / om;
                    e -= om*temp;
                    int stud1 = temp;
                    stud += temp;
                    temp = h / chocoM;
                    h -= chocoM*temp;
                    int stud2 = temp;
                    stud += temp;
                    int remain = Math.min(e,h);
                    int stud3 = remain;
                    if(remain >= 1){
                        stud += remain;
                    }

                    //counting the price
                    //---fin---om--milk--cake
                    int fin = ((stud1*a)+(stud2*b)+(stud3*c));
                    if(fin <= minCost){
                        minCost = fin;
                    }

                }
            }else{
                int min = Math.min(e,h);
                if(min >= n){
                    //This is first & naive distribution technique
                    if(min*c <= minCost){
                        minCost = min*c;
                    }
                    //This is second distribution technique
                    int temp = e / om;
                    e -= om*temp;
                    int stud1 = temp;
                    stud += temp;
                    temp = h / chocoM;
                    h -= h*temp;
                    int stud2 = temp;
                    stud += temp;
                    int remain = Math.min(e,h);
                    int stud3 = remain;
                    if(remain >= 1){
                        stud += remain;
                    }

                    //counting the price
                    //---fin---om--milk--cake
                    int fin = ((stud1*a)+(stud2*b)+(stud3*c));
                    if(fin <= minCost){
                        minCost = fin;
                    }
                }
            }
            if(minCost == 1000000000){
                minCost = -1;
            }
            System.out.println(minCost);
        }
    }
}
