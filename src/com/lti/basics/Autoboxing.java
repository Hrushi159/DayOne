package com.lti.basics;

public class Autoboxing {

	public static void main(String[] args) {
     int a= 10;
     Integer i = Integer.valueOf(a);
     Integer j = a;
     
     System.out.println("Datatype "+a);
     System.out.println("Object 1 "+i);
     System.out.println("object 2 "+j);

	}

}
