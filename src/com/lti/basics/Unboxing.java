package com.lti.basics;

public class Unboxing {

	public static void main(String[] args) {
		Integer i = new Integer(50);
		int a  = i.intValue();
		int b = i;
		System.out.println("Object "+i);
		System.out.println("Datatype1 "+a);
		System.out.println("Datatype1 "+b);

		

	}

}
