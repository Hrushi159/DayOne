package com.lti.basics;
import java.util.Scanner;
public class TwoDimentinalArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] a = new int[2][3];
		System.out.println("Enter the values");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("The value are");
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		

	}

}
