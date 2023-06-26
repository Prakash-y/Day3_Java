package Day3;

import java.util.Scanner;

public class Prime_Factor 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		
		int n = sc.nextInt();
		for(int i = 2; i*i<=n; i++)
		{
			while(n % i == 0)
			{
				n=n/i;
				System.out.println(i+" ");
			}
		}
		if(n!= 1)
		{
			System.out.println(n);
		}
		
	}
}
