package hDiv;
import java.util.*;
public class Solution
{
	public static void main (String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		int maxDiv = 1;
		for(int i=2; i<10; i++){
		    if(n % i == 0){
		        maxDiv = i;
		    }
		}
		System.out.println(maxDiv);
	}
}
