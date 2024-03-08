package com.training.whileloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
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
		
		String sInput = null;
		boolean x = false;
		int a=0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		int count = 0;
		while(x != true) {
		try {
			System.out.println("How many grades will be entered?");
			count = s.nextInt();
			
		while(count > 0) {
			System.out.println("Please enter a grade (for example: A,B,C,D,F): ");
			sInput = s.next().toLowerCase().strip();
			
			switch(sInput) {
			case "a":
				a++;
				break;
			case "b":
				b++;
				break;
			case "c":
				c++;
				break;
			case "d":
				d++;
				break;
			case "f":
				f++;
				break;
				default:
					System.out.println("Incorrect input!!! ");
					whileGrades();
					break;
			} // end switch
			count--;
		} // end lower while
		System.out.println("A:"+a+" B:"+b+" C:"+c+" D:"+d+" F:"+f);
		
		System.out.println("Press X then enter to exit the program:");
		sInput = s.next();
		if(sInput.equals("X") || sInput.equals("x")) {
			System.out.println("Good Bye!");
			x = true;
		}
		else{			
			x = false;
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}		
		
		}	// end upper while	
	}

	public void whileHistogram() {
		int rows = 0;	
		int rowSave = 0;
		int columns = 0;
		int columnSave = 0;
		
		System.out.print("Enter number of rows ---> ");
		rows = s.nextInt();	
		rowSave = rows;
		System.out.print("Enter number of columns---> ");
		columns = s.nextInt();
		columnSave = columns;
		
		while(rows > 0) {
			System.out.print("*");
			while(columns > 1) {				
				System.out.print("*");
				columns--;
			}
			rows--;			
			columns = columnSave;			
			System.out.println(" ");
		}
	}

	public void whileLargestSmallest() {
		int n = 0;
		List<Integer> nSequence = new ArrayList<>();
		System.out.println("Enter the amount of numbers in the sequence: ");
				n = s.nextInt();
				while(n <= 0) {
					System.out.println("Cannot choose number less of equal to zero, enter number again..");
					n = s.nextInt();
				}
				while(n > 0) {
					System.out.print("Enter number in sequence: ");
					nSequence.add(s.nextInt());
					System.out.println(" ");
					n--;
				}
				Collections.sort(nSequence);
				System.out.println("The largest number is: "+ nSequence.get(nSequence.size()-1));
				System.out.println("The smallest number is: "+ nSequence.get(0));
	}

	public static void main(String... args) {

		WhileExercises w = new WhileExercises();

		//w.thirdOrderPolynomial();
		//w.whileAverage();
		//w.whileGrades();
		//w.whileHistogram();
		w.whileLargestSmallest();
	}
}
