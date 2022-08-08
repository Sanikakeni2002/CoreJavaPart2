package com.java.file;

import java.io.FileReader;

public class SimpleReader {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("G://abc.txt");
		int i;
		while ((i = fr.read()) != -1)
		System.out.print((char) i);
		fr.close();
	}

}
