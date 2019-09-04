package com.revature.intro;

public class Primitives {

	public static void main(String[] args) {
		numberBases();
		//numberFormatting();
		//casting();
		//System.out.println(charToNum('Z'));
		//System.out.println(numToChar(90));
		wrappers();
	}

	static void numberBases() {
		int dec = 10;
		System.out.println(dec);

		//BINARY (Base 2; vals 0-1; 0B or 0b to preface digits)
		int binary = 0b1011110;
		System.out.println(binary);

		//OCTAL (base 8; 0-7; preface digits with 0)
		int octal = 010;
		System.out.println(octal);

		//HEX (base 16; 0-9, a-f)
		int hex = 0xa314f;
		System.out.println(hex);
	}

	static void numberFormatting() {
		int largeNum = 1_000_000;
		double rightDouble = 136.43_54;

		System.out.println(largeNum);
		System.out.println(rightDouble);

		long max = 21464836472l;

		System.out.println(max);
	}

	static void casting() {
		int x = 32767;
		long lon = x;
		System.out.println(lon);
		short sh = (short) x;
		System.out.println(sh);
	}

	static int charToNum(char c) { return (int) c; }

	static char numToChar(int num) { return (char) num; }
	
	static void wrappers() {
		System.out.println(Integer.MAX_VALUE);
		//int num = Integer.parseInt("10");
		System.out.println(Integer.parseInt("9"));
	}
}
