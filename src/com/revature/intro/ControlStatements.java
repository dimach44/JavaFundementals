package com.revature.intro;

public class ControlStatements {
	
	public static void main(String[] args) {
		
		int num = 90;
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
