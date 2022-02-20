package myPackage;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any positive integer");
		int num = sc.nextInt();
		
		if((num & 1) == 0)
			System.out.println("It's Even");
		else
			System.out.println("It's Odd");
     sc.close();
	}

}
