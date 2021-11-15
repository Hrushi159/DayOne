package com.lti.basics;
import java.util.Scanner;

public class OneDimensinalArray {

	public static void main(String[] args) {
		Scanner scan =new  Scanner(System.in);
		int[] a = new int[3];
		System.out.println("Enter the values");
		for(int i=0;i<3;i++) {
			a[i] = scan.nextInt();
		}
		for(int i=0;i<3;i++) {
			System.out.print(" "+a[i]);
		}
		

	}

}
