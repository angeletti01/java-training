package com.training.tests;

public class LoopTest {
public static void main(String...args) {
	var counter = 0;
	outer:
		for(var i=0; i<3; i++) {
			System.out.println("Inside Outer");
			middle:
				for(var j=0; j<3; j++) {
					System.out.println("Inside Middle");
					inner:
						for(var k=0; k<3; k++) {
							System.out.println("Inside Inner");
							if(k-j >0) {
								break middle;
							}
						}
				}
			counter++;
		}
	System.out.println(counter);
}
}
