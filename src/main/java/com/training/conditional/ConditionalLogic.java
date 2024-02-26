package com.training.conditional;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConditionalLogic {

	public void preAndPostDifferences() {
		int x = 5;
		int y = 10;
		
		System.out.println("The value of x is "+x);
		System.out.println("The value of ++x is "+ ++x);
		System.out.println("The value of x++ is "+ x++);
		System.out.println("The value of x is "+x);
		
		System.out.println("The value of y is "+ y);
		System.out.println("The value of --y is "+ --y);
		System.out.println("The value of y-- is "+ y--);
		System.out.println("The value of y is "+ y);
		
	}
	
	public void booleanLogicShortCircuitOps() {
		boolean b = false;
		int x = 3;
		
		if(x<0 && (b=true)) {
			System.out.println(b);
		}
		if (x>0 || (b=true)) {
			System.out.println(b);
		}		
	}
	
	public void booleanBitwiseOps() {
		boolean b = false;
		int x = 3;
		
		if(x<0 & (b=true)) {
			System.out.println(b);
		}
		if (x>0 | (b=true)) {
			System.out.println(b);
		}
	}
	
	public void compareStrings() {
		Scanner s = new Scanner(System.in);
		String s1 = null;
		String s2 = null;
		
		System.out.println("Please enter a word or sentence then press Enter!");
		s1 = s.next();
		System.out.println("Please enter another word or sentence then press Enter!");
		s2 = s.next();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
	
	public boolean admitToFilm(int cert, int age){		
		
		System.out.println("Age verification in progress.....");
		if(cert <= age) {
			System.out.println("You are old enough");
			return true;
		}
		else {
			System.out.println("You are not old enough !!!!!");
			return false;
		}		
	}
	
	public void switchVowelOrConsonant() {
	Scanner s = new Scanner(System.in);	
	char letter = ' ';	
	
	System.out.println("Enter a character and press Enter ");	
	letter = s.next().toLowerCase().charAt(0);	
	
	if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
		try {
		switch(letter) {
		case 'a':
			System.out.println(letter + " is a vowel");
			break;
			
		case 'e':
			System.out.println(letter + " is a vowel");
			break;
			
		case 'i':
			System.out.println(letter + " is a vowel");
			break;
			
		case 'o':
			System.out.println(letter + " is a vowel");
			break;
			
		case 'u':
			System.out.println(letter + " is a vowel");
			break;
			
			default:
			System.out.println(letter + " is not a vowel");
			break;
		}	
		} catch(InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Incorrect input, please try again");
		}
	
	} // end if
	}
	
	public void ifMonth() {
		Scanner s = new Scanner(System.in);
		int month = 0;
		final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUNE = 6, 
				JULY = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
		
		try {
		System.out.println("Please enter a month from 1 to 12");
		month = s.nextInt();
		while(month < 0 | month > 12) {
			System.out.println(month + " is out of range." );
			month = s.nextInt();
		}
		if(month > 0 & month <= 12) {
			switch(month) {
			case JAN: 
				System.out.println("January");
			break;
			case FEB:
				System.out.println(" February");
				break;
			case MAR:
				System.out.println("March");
				break;
			case APR:
				System.out.println("April");
				break;
			case MAY:
				System.out.println("May");
				break;
			case JUNE:
				System.out.println("June");
				break;
			case JULY:
				System.out.println("July");
				break;
			case AUG:
				System.out.println("August");
				break;
			case SEP:
				System.out.println("September");
				break;
			case OCT:
				System.out.println("October");
				break;
			case NOV:
				System.out.println("November");
				break;
			case DEC:
				System.out.println("December");
				break;
			}
		}			
		
		else {
			System.out.println(month+" out of range");
			
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			month = s.nextInt();
		}
	}
	
	public void ifGrade() {
		Scanner s = new Scanner(System.in);
		int mark = 0;
		System.out.println("Please enter a mark from 0 to 100");
		mark = s.nextInt();
		while(mark < 0 | mark > 100) {
			System.out.println("Invalid value, try again...");
			mark = s.nextInt();
		}
		if(mark >= 70 & mark < 100) {
			System.out.println("A");
		}
		else if(mark >=60 & mark <=69){
			System.out.println("B");
		}
		else if(mark >=50 & mark <=59){
			System.out.println("C");
		}
		else if(mark >=40 & mark <=49){
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public void switchMathOperation() {
		Scanner s = new Scanner(System.in);
		double answer = 0.0;
		boolean operationOK = true;
		double num1 = 0.0;
		double num2 = 0.0;
		String operation = null;
		try {
		System.out.println("Please enter a decimal number...");
		num1 = s.nextDouble();		
		System.out.println("Please enter a second decimal number...");
		num2 = s.nextDouble();		
		
		do {
			System.out.println("Please enter a Arithmatic operator: + , - , * , / , or %");
			operation = s.next();	
		if(operation.equals("+")  || operation.equals("-") || operation.equals("*")  || operation.equals("/")  || operation.equals("%")) {			
			operationOK = true;			
		}
		else {
			System.out.println("Unknown mathematical operator "+ operation);
			operationOK = false;
			switchMathOperation();
		}
		}
		while(operationOK = false);
		
		if(operationOK = true) {
			switch(operation) {
			case "+":
				answer = num1+num2;
				break;
			case "-":
				answer = num1-num2;
				break;
			case "*":
				answer = num1*num2;
				break;
			case "/":
				answer = num1/num2;
				break;
			case "%":
				answer = num1%num2;
				break;
				default:
					System.out.println("Please try again....");
			}			
		}
		System.out.println(num1+" "+ operation+" "+num2+ " "+ "= "+ answer);
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ifTemperature(){
		Scanner s = new Scanner(System.in);
		int temperature = 0;
		final int COLD = 0;
		final int MILD = 15;
		final int WARM = 20;
		final int VERY_WARM = 25;
		final int HOT = 30;
		try {
		System.out.println("Please enter a temperature in Celsius: ");
		temperature = s.nextInt();
		
		if(temperature <= COLD) {
			System.out.println("cold");
		}
		else if(temperature > COLD & temperature < MILD){
			System.out.println("a little cold but ok");
		}		
		else if(temperature >= MILD & temperature < WARM){
			System.out.println("mild");
		}
		else if(temperature >= WARM & temperature < VERY_WARM) {
			System.out.println("warm");
		}
		else if(temperature >= VERY_WARM & temperature < HOT){
			System.out.println("very warm");
		}
		else if(temperature >= HOT){
			System.out.println("hot");
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid input, try again");
			temperature = s.nextInt();
		}
	}
	
	public void switchDaysInMonth() {
		Scanner s = new Scanner(System.in);
		int month = 0;
		int numDays = 0;
		int year = 0;
		final int JAN = 1, FEB = 2, MAR = 3, APR = 4, MAY = 5, JUNE = 6, 
				JULY = 7, AUG = 8, SEP = 9, OCT = 10, NOV = 11, DEC = 12;
		try {
		System.out.println("Please enter a number between 1 and 12");
		month = s.nextInt();
		while(month < 0 | month > 12) {
			System.out.println("Please enter valid number");
			month = s.nextInt();
		}
		switch(month) {
		case JAN, MAR, MAY, JULY, AUG, OCT, DEC:
			numDays = 31;
		break;
		
		case APR, JUNE, SEP, NOV:
			numDays = 30;
		break;
		case FEB:
			System.out.println("Please enter a year");
			year = s.nextInt();
			if(year % 400 == 0) {
				numDays = 29;
			}
			else if(year % 4 == 0 & year % 100 > 0 ) {
				numDays = 29;
			}
			else {
				numDays = 28;
			}
			break;
		default:
			System.out.println("Invalid entry....");
		}
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Invalid entry.....");
			switchDaysInMonth();
		}
		System.out.println("Month: "+ month +" Number of Days: " + numDays);
	}
	
	public static void main(String args[]) {
		ConditionalLogic c = new ConditionalLogic();
		Scanner s = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		c.switchDaysInMonth();
		//c.ifTemperature();
		//c.switchMathOperation();
		//c.ifGrade();
		//c.ifMonth();		
		//c.preAndPostDifferences();
		//c.booleanLogicShortCircuitOps();
		//c.booleanBitwiseOps();
		//c.compareStrings();
		
	/* admitToFilm() dialog */	
	/* System.out.println("Enter age to view film: ");
		x = s.nextInt();		
		System.out.println("Enter your age: ");
		y = s.nextInt();
		System.out.println(c.admitToFilm(x, y)); */		
	}
}
