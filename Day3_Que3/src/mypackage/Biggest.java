package mypackage;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int [] num = new int [5];
		int i = 0; int max = 0 ;
		System.out.println("ENter five number.");
		while(i < 5) {
			num[i] = scan.nextInt();
			if(num[i] > max)
				max = num [i];
			i++;
		}
		System.out.println("Biggest among all number is "+ max +".");
		scan.close();
		
	}

}
