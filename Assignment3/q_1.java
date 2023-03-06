package Assignment3;

import java.util.Scanner;

public class q_1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter the number");
		int x = s.nextInt() ;
		
		System.out.println((((8+x)/3)%5)*5);
		
	}
}
