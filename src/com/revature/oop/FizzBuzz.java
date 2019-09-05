package com.revature.oop;

public class FizzBuzz {
	
	public static void main(String[] args) {
		for(int i = 0;i < 100;i++) {
			if ((i + 1) / 3 == 1) {
				System.out.println("Fizz");
			} else if ((i + 1) / 5 == 1) {
				System.out.println("Buzz");
			} else {
				System.out.println(i + 1);
			}
		}
	}
	
}
