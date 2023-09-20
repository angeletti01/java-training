package com.training.operators;

import java.util.Scanner;

public class Operators {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String...args) {
	
		System.out.println("Please enter value for x then press enter: ");
	int x = scan.nextInt();
	System.out.println("Please enter value for y then press enter: ");
	int y = scan.nextInt();
	
	logicalOps(x,y);
	simpleMaths(x,y);
	modulus(x,y);
	incrDecr();	
	
	} // end main
	
public static void logicalOps(int x, int y) 
{
	if(x > 0 && y > 0) {
		System.out.println("Numbers are Positive");
	}
	else if(x < 0 && y < 0) {
		System.out.println("Numbers are Negative");
	}
	else if(x == 0 || y == 0) {
		System.out.println("One of the numbers is 0");
	}
	else if(x < 0 || y < 0) {
	System.out.println("One of the numbers is Negative");	
	}	
 
} // end logicalOps

	public static void simpleMaths(int x, int y) {
	
	int sum = x+y;
	int product = x*y;
	int difference = x-y;
	int quotient = x/y;
	
	System.out.println("The sum of "+x+" + "+y+ " is "+ sum);
	System.out.println("The product of "+x+" x "+y+ " is "+ product);
	System.out.println("The difference of "+x+" - "+y+ " is "+ difference);
	System.out.println("The quotient of "+x+" / "+y+ " is "+ quotient);
}
	
	public static boolean modulus(int x, int y) {
		boolean result = false;
		if(x%y == 0) {
			System.out.println(x+" is a multiple of "+y);			
			result = true;			
		}
		else {
			System.out.println(x+ " is not a multiple of "+y);
			result = false;
		}
		System.out.println(result);
		return result;
	}
	
	public static void incrDecr() {
		int x =0, w = 0, y=0, z=0;
		x = 4;
		System.out.println(++x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(--x);
		System.out.println(x--);
		System.out.println(x);
		
		w=20;
		x=10;
		y=-5;
		z=0;
				
		System.out.println(w==x && y != z);
		System.out.println(w == x || y != z);
		System.out.println(!(w==(x+z)));
	}
}
