package com.java.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout= new FileOutputStream("G://abc.txt");
			fout.write(97);
			fout.write(98);
			fout.write(99);
			fout.write(100);
			fout.write(101);
			fout.write(102);
			fout.close();
			System.out.println("Writing into file is successful");
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
