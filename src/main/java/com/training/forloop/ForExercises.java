/**
 * @author Rico-Kali Hayes
 * Date: 02/27/2024
 * Description: Simple Java for-loop training.
 * */
package com.training.forloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ForExercises {

	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		ForExercises f = new ForExercises();

		// f.forLargestSmallest();
		// f.forHistogram();
		// f.forAverage();
		f.twelveDaysOfChristmas();
	}

	public void forLargestSmallest() {
		List<Integer> numArray = new ArrayList<>();
		int larger = 0;
		int smaller = 0;
		int current = 0;
		int n = 0;

		try {
			System.out.println("Input a number for n");
			n = s.nextInt();

			for (int i = 0; i < n; i++) {
				System.out.println("Input a number for the sequence");
				numArray.add(s.nextInt());
				while (numArray.get(i) == 0) {
					System.out.println("Input a number for n");
					numArray.add(s.nextInt());
				}
			}
			Collections.sort(numArray);

			for (int i = 0; i < numArray.size(); i++) {
				current = numArray.get(i);
				for (int j = 0; j < 1; j++) {
					if (current > larger) {
						larger = current;
					} else {
						smaller = numArray.get(0);
					}
				}
			}

			for (int list : numArray) {
				System.out.println(list);
			}

			System.out.println("The largest number is " + larger + ".");
			System.out.println("The smallest number is " + smaller + ".");
		} catch (Exception e) {
			e.printStackTrace();
			forLargestSmallest();
		}
	}

	public void forHistogram() {
		int rows = 0;
		int columns = 0;
		try {
			do {
				System.out.println("Enter number of rows");
				rows = s.nextInt();
			} while (rows <= 0);
			do {
				System.out.println("Enter number of columns");
				columns = s.nextInt();
			} while (columns <= 0);
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
			forHistogram();
		}
	}

	public void forAverage() {
		int n = 0;
		int average = 0;
		int sum = 0;

		List<Integer> numbers = new ArrayList<>();
		try {
			do {
				System.out.println("Please enter the amount of numbers.");
				n = s.nextInt();
			} while (n <= 0);

			for (int i = 0; i < n; i++) {
				try {
					System.out.println("Please enter number: " + i);
					numbers.add(s.nextInt());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("Invalid Number");
					forAverage();
				}
			}
			for (int num : numbers) {
				sum += num;
			}
			average = sum / n;
			System.out.println("The average is: " + average);

		} catch (Exception e) {
			e.printStackTrace();
			forAverage();
		}
	}

	public void twelveDaysOfChristmas() {
		List<String> yellow = new ArrayList<>();
		List<String> blue = new ArrayList<>();
		yellow.add("first");
		yellow.add("second");
		yellow.add("third");
		yellow.add("fourth");
		yellow.add("fifth");
		yellow.add("sixth");
		yellow.add("seventh");
		yellow.add("eight");
		yellow.add("ninth");
		yellow.add("tenth");
		yellow.add("eleventh");
		yellow.add("twelfth");
		blue.add("A partridge in a pear tree.");
		blue.add("Two turtle doves, and \n A partridge in a pear tree.");
		blue.add("Three French hens, \n Two turtle doves, and \n A partridge in a pear tree.");
		blue.add("Four calling birds, \n Three French hens, \n Two turtle doves, and \n A partridge in a pear tree.");
		blue.add(
				"Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Seven swans a-swimming, \n Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Eight maids a-milking, \n Seven swans a-swimming, \n Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Nine ladies dancing, \n Eight maids a-milking, \n Seven swans a-swimming, \n Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Ten lords a-leaping, \n Nine ladies dancing, \n Eight maids a-milking, \n Seven swans a-swimming, \n Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Eleven pipers piping, \n Ten lords a-leaping, \n Nine ladies dancing, \n Eight maids a-milking, \n Seven swans a-swimming, \n Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");
		blue.add(
				"Twelve drummers drumming, \n Eleven pipers piping, \n Ten lords a-leaping, \n Nine ladies dancing, \n Eight maids a-milking, \n Seven swans a-swimming, \n Six geese a-laying, \n Five golden rings, \n Four calling birds, \n Three French hens, \n Two turtle doves, \n and A partridge in a pear tree.");

		for (int i = 0; i < yellow.size(); i++) {
			System.out.print("On the " + yellow.get(i));

			switch (i) {
			case 0:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 1:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 2:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 3:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 4:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 5:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 6:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 7:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 8:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 9:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 10:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			case 11:
				System.out.println(" day of Christmas, \n my true love gave to me \n " + blue.get(i));
				break;
			default:
				System.out.println("There is no Santa Clause!");
			}
			System.out.println("\n");
		}
	}
}
