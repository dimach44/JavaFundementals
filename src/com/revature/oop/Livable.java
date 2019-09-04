package com.revature.oop;

public interface Livable {
	
	int x = 10; //public static and final by default
	
	int reproduce();
	String communicate();
	Object consume();
	
	default void survive() {
		System.out.println("stayin alive");
	}
	
	void move();
}
