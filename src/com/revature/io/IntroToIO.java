package com.revature.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IntroToIO {
	
	public static void main(String[] args) {
		//writeString("test", "src/com/revature/io/text.txt");
		write("test", "src/com/revature/io/text.txt");
	}
	
	static void writeString(String text, String filepath) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(filepath));
			bw.write(text);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void write(String text, String filepath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))) {
			bw.write(text);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
