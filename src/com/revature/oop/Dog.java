package com.revature.oop;

public class Dog extends Animal{
	
	public String type = "Dog";
	
	@Override
	public String communicate() {
		return null;
	}

	@Override
	public int reproduce() {
		return 0;
	}
	
	@Override
	public Object consume() {
		System.out.println("DOG CONSUME METHOD");
		System.out.println(super.consume());
		return "Puppy chow";
	}
	
	void forDogsOnly() {
		System.out.println("For Dogs only");
	}

	@Override
	public void move() {
		
	}
	
}
