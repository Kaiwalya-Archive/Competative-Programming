package HackerRank.CatsAndAMouse;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] results = new String[n];
        int x,y,z;

        for (int i = 0; i < n; i++) {
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            results[i]=findTheCat(x,y,z);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(results[i]);
        }
    }
    public static String findTheCat(int x, int y, int z){
//        int res1 = mouse - cat1;
//        int res2 = mouse - cat2;
//
//        if(res1<res2 && res1+res2 != 0){
//            return("Cat A");
//        }else if(res1>res2 && res1+res2 != 0){
//            return("Cat B");
//        }else{
//            return("Mouse C");
//        }
        if(Math.abs(x - z) < Math.abs(y-z)){
            return "Cat A";
        }
        else if (Math.abs(x - z) > Math.abs(y-z)){
            return "Cat B";
        }
        else{
            return "Mouse C";
        }
    }
}
