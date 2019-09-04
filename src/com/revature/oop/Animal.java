package com.revature.oop;

public abstract class Animal implements Livable{
	
	public String type = "Animal";

	@Override
	public Object consume() {
		return "Yum! I am eating good food";
	}
	
}
