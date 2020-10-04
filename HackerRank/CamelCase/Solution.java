package HackerRank.CamelCase;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count=0;
        String s = sc.nextLine();
        sc.close();
        for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            count++;
        }
        System.out.println(count);
    }
}
