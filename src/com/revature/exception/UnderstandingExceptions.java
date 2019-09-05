package com.revature.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnderstandingExceptions {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = {1, 4, 5, 6, 7};
		throwsRuntime(arr);
		//run();
		index();
		nullPoint();
		arithmetic();
	}

	static void throwsRuntime(int[] arr) throws ArrayIndexOutOfBoundsException {
		System.out.println(arr[10]);
	}

	static void arithmetic() {
		try {
			int num = 3;
			System.out.println("Enter a number to divide by");
			int div = scanner.nextInt();
			System.out.println(num / div);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by 0");
		}

	}

	static void nullPoint() {
		Object name = null;
		try {
			System.out.println(name.toString());
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception.");
		}
	}

	static void index() {
		try {
			int[] arr = {1,2};
			System.out.println(arr[3]);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index is out of bounds.");
		}

	}

	static void run() {
		System.out.println("Enter a number");
		try {
			String numString = scanner.nextLine();
			int num = Integer.parseInt(numString);
			System.out.println("You entered " + num);
		} catch (NumberFormatException e) {
			System.out.println("You entered an invalid value. Please try again!");
			run();
		}
	}
	static void runWithNextInt() {
		System.out.println("Enter a number");
		try {
			int num = scanner.nextInt();
			System.out.println("You entered " + num);
		} catch (InputMismatchException e) {
			System.out.println("You entered an invalid value. Please try again!");
			run();
		}
	}

}
