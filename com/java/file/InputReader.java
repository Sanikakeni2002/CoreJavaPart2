package com.java.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream f = new FileInputStream("G://abc.txt");
			InputStreamReader is = new InputStreamReader(f);
			int m;
			while ((m = is.read()) != -1) {
				char r = (char) m;
				System.out.println("Character : " + r);
				boolean b = is.ready();
				System.out.println("Ready? : " + b);
				is.close();
				f.close();
			}
		} catch (FileNotFoundException fe) {
			// TODO: handle exception
			System.out.println("NO Such File Exists");
		} catch (IOException except) {
			System.out.println("IOException occurred");
		}
	}

}
