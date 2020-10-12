package HackerRank.DesignerPdfViewer;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[26];
        for (int i = 0; i < 26; i++) {
            n[i] = sc.nextInt();
        }
        String st = sc.nextLine();
        for(int i=0; i<26; i++) {
        	System.out.print(n[i]+" ");
        }
        System.out.println(st);
        sc.close();
    }
}
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
