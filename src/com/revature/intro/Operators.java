package com.revature.intro;

public class Operators {
	
	public static void main(String[] args) {
		//postIncrement(4);
		//preIncrement(4);
		System.out.println(complement(4));
	}
	
	static void postIncrement(int count) {
		count = 5;
		if(count++ == 5) {
			System.out.println("true");
		}
		System.out.println(count);
	}
	
	static boolean preIncrement(int count) {
		return ++count == 5;
	}
	
	static void decrement(int count) {
		--count;
		count--;
	}
	
	static void testUnary(int count) {
		if(count++<5) {
			System.out.println(count);
		}
	}
	
	static int complement(int x) {
		return ~x;
	}
	
	static int negate(int x) {
		return -x;
	}
	
	static boolean opposite(boolean exp) {
		return !exp;
	}
	
	static int additive(int x) {
		return +x;
	}
}
