package ChefAndGroup;
import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int p = t;
        while(t-->=0){
            String s = sc.nextLine();
            int n = 0;
            int flag = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i)=='1' && flag == 0){
                    flag = 1;
                    n++;
                }
                if(s.charAt(i) == '0'){
                    flag = 0;
                }
            }
            if(t != p-1){
                System.out.println(n);
            }
        }
    }
}
