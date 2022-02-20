package myPackage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int [] num  = new int [5]; int i = 0; int sum = 0 ; int average ;
    
    System.out.println("Enter five number : ");
    
    while(i < 5) {
    	num[i] = scan.nextInt();
    	sum += num[i++];
    }
    
    average = sum / 5 ;
    
    System.out.println("\nSum of given number is "+sum+".\n"+"Average of given number is "+average+".");
    scan.close();

	}

}
