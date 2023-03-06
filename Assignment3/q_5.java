package Assignment3;

import java.util.Scanner;

public class q_5 
{

	public static void main(String[] args) 
	{
	 Scanner s = new Scanner(System.in) ;
	 int x = 65 ;
	 int y = 80 ;
	 
	 int n = x^y ;
	 int count = 0 ;
	 
	 while(n != 0)
	 {
		 n = n & (n-1) ;
		 count ++ ;
	 }
	 System.out.println(count);

	}

}
