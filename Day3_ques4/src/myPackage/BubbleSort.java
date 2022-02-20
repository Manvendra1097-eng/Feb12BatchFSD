package myPackage;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] num = {12,24,56,78,75,33,45,0,1,5};
		bubbleSort(num);
		System.out.println(Arrays.toString(num));

	}
	
	public static void bubbleSort(int [] numarr) {
		
		for(int i = 0; i < numarr.length ; i++) {
			for(int j = 1 ; j < numarr.length - i ; j++) {
				if(numarr[j] < numarr [j-1]) {
					int temp = numarr[j-1];
					numarr[j-1] = numarr[j];
					numarr[j] = temp ;
				}
			}
		}
		
	}
}
