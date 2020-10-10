package HackerRank.BreakingTheRecords;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//No of games
        int[] games = new int[n];//The score of games
        for (int i = 0; i < n; i++) {//Scores of games
            games[i] = sc.nextInt();
        }
        int curr = games[0];
        int max = 0;
        int min = 0;

        for (int i = 0; i < games.length; i++) {
            if(curr<games[i]){
                max++;
                curr=games[i];
            }
        }

        curr = games[0];
        for (int i = 0; i < games.length; i++) {
            if(curr>games[i]){
                min++;
                curr=games[i];
            }
        }
        System.out.print(max+" "+min);
    }
}
