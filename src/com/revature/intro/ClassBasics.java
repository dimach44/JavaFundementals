package com.revature.intro;

import java.util.Arrays;

public class ClassBasics {
	
	private String aboutMe;
	
	ClassBasics(){}
	
	public ClassBasics(String aboutMe) {
		super();
		this.aboutMe = aboutMe;
	}
	
	public String getAboutMe() {
		return aboutMe;
	}

	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}

	public static void main(String[] args) {
		
		ClassBasics basics = new ClassBasics();
		basics.learnJava();
		
	}
	
	public static void sortNums(int... nums) {
		Arrays.sort(nums);
	}
	
	void doThings() {
		learnJava();
	}
	
	void learnJava() {
		sortNums(1);
		sortNums(100,31,35,124,46,342354);
		sortNums(1,2,4,5,6);
	}
}

class AnotherClass {
	
}
