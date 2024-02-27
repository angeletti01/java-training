package com.training.forloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ForExercises {

	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		ForExercises f = new ForExercises();
		
		f.forLargestSmallest();
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
		
		for(int i = 0; i < n; i++) {
			System.out.println("Input a number for the sequence");
			numArray.add(s.nextInt()); 
			while(numArray.get(i) == 0) {
				System.out.println("Input a number for n");
				numArray.add(s.nextInt());	
			}
		}	
		Collections.sort(numArray);
		
		for(int i=0;i<numArray.size();i++) {	
			current = numArray.get(i);
				for(int j=0; j<1;j++) {
					if(current > larger) {
						larger = current;
					}
					else {
						smaller = numArray.get(0);
					}
				}		
		}
		
		for(int list:numArray) {
			System.out.println(list);			
		}
		
		System.out.println("The largest number is "+larger+".");
		System.out.println("The smallest number is "+smaller+".");
		} // end try
		catch(Exception e) {
			e.printStackTrace();
			forLargestSmallest();
		}
	}
	
	public void forHistogram() {}
	public void forAverage() {}
	public void twelveDaysOfChristmas() {}
}
