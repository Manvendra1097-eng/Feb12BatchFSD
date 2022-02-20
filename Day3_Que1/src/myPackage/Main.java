package myPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int [] num  = new int [5];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five number you want tp print.");
		for(int i = 0; i <5 ; i++) {
			num [i] = scan.nextInt();
		}
		for(int i : num) {
			  System.out.print(i +" ");
		}
	}
}
