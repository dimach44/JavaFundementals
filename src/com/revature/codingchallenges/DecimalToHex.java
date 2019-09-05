package com.revature.codingchallenges;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number n for fizzbuzz");
		String numString = scanner.nextLine();
		int num = Integer.parseInt(numString);
		intToHex(num);
		scanner.close();
	}
	
	static void intToHex(int num) {
		String out = "";
		
		while(num > 0) {
			int rem = num % 16;
			if(rem > 9) {
				char temp = (char) (rem + 87);
				out = temp + out;
			} else {
				out = rem + out;
			}
			num /= 16;
		}
		
		System.out.println(out);
	}
}
