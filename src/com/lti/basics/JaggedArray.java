package com.lti.basics;

import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[3][];
		a[0] = new int[1];
		a[1] = new int[3];
		a[2] = new int[2];
		System.out.println("Enter the values");
		for(int i=0;i<3;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j] = scan.nextInt();
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
