package com.training.whileloop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WhileExercises {

	Scanner s = new Scanner(System.in);
	Exception e = new Exception();

	// Calculate third order polynomial of fx=ax^3+bx^2+cd+d
	public void thirdOrderPolynomial() throws InputMismatchException {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int x = 0;
		int fx = 0;

		String choice = null;

		try {
			System.out.println("Input value for a: ");
			a = s.nextInt();
			while (a <= 0) {
				System.out.println("Input value for a: ");
				a = s.nextInt();
			}		
		
			System.out.println("Input value for b: ");
			b = s.nextInt();
			while (b <= 0) {
				System.out.println("Input value for b: ");
				b = s.nextInt();
			}		
		
			System.out.println("Input value for c: ");
			c = s.nextInt();
			while (c <= 0) {
				System.out.println("Input value for c: ");
				c = s.nextInt();
			}		 
		
			System.out.println("Input value for d: ");
			d = s.nextInt();
			while (d <= 0) {
				System.out.println("Input value for d: ");
				d = s.nextInt();			
		} 
			System.out.println("Input value for x: ");
			x = s.nextInt();
			while (x <= 0) {
				System.out.println("Input value for x: ");
				x = s.nextInt();
			}
			}	
		 catch (Exception e) {
			e.printStackTrace();
			System.out.println("Not a valid entry");
			System.exit(0);
			
		}

		fx = (a * x ^ 3) + (b * x ^ 2) + (c * x) + d;
		System.out.println("fx is equal to: " + fx);

		try {
			System.out.println("Would you like to try again, Yes or No?");
			choice = s.next();

			if (choice.equalsIgnoreCase("yes") ){
				System.out.println("Lets go again!");
				thirdOrderPolynomial();
			} else {
				System.out.println("Good Bye");
				System.exit(0);
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public void whileAverage() {
		int numberSequence = 0;
		int num = 0;
		int average = 0;
		int sum = 0;
		int count = 0;
		
		try {
		System.out.println("Please enter number for numbers in sequence: ");
		numberSequence = s.nextInt();
		count = numberSequence;
		
		while(numberSequence <= 0) {
			System.out.println("Please enter number for numbers in sequence: ");
			numberSequence = s.nextInt();
			count = numberSequence;
		}
		while(count > 0) {
			System.out.println("Please enter a number: ");
			num = s.nextInt();
			sum += num;
			count--;
		}
		average = sum/numberSequence;
		System.out.print("The average is: "+average);;
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void whileGrades() {
	}

	public void whileHistogram() {
	}

	public void whileLargesSmallest() {
	}

	public static void main(String... args) {

		WhileExercises w = new WhileExercises();

		//w.thirdOrderPolynomial();
		w.whileAverage();
	}
}
