package Assignment3;

import java.util.Scanner;

// sum of the digits of the two number 
public class q_3
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("Write a 3 digit number");
		int num = s.nextInt() ;
		
		int sum = 0 ;
		
		while(num>0)
		{
			sum += num % 10 ;
		    num = num / 10 ;
		}
		
		System.out.println(sum);
	}

}
