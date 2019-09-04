package com.revature.intro;

public class ControlStatements {
	
	public static void main(String[] args) {
		intToHex(90);
		
	}
	
	static void intToHex(int n) {
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
	
	static int leftShift(int num, int shift) {
		return num << shift;
	}
	
	static boolean relational(Object obj) {
		if(obj instanceof String) return true;
		else return false;
	}
	
	public boolean equalTo(int a, int b) {
		if(a == b) return true;
		else if (a != b) return false;
		else return false;
	}
	
	static int bitwiseOr(int a, int b) {
		return a | b;
	}
}
