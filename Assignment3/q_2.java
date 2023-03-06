package Assignment3;

import java.util.Scanner;

//swap two numbers without the use of third variable
public class q_2 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in) ;
		
		System.out.println("Enter the first number");
		int num1 = s.nextInt() ;
		
		System.out.println("Enter the second number");
		int num2 = s.nextInt() ;
		System.out.println("Before swapping :");
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = num1 + num2 ;
		num2 = num1 - num2 ;
		num1 = num1 - num2 ;
		
		System.out.println("After swaping :");
		System.out.println(num1);
		System.out.println(num2);

	}

}
