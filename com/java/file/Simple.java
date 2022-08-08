package com.java.file;

import java.io.FileWriter;

public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter("G://abc.txt");
			fw.write("Welcome");
			fw.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("success");
	}

}
