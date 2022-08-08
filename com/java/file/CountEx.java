package com.java.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountEx {

	public static void main(String[] args) throws  IOException{
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("G://abc.txt");
		BufferedReader br = new BufferedReader(fr);
		String currentLine = br.readLine();
		int linecount=0;
		int wordcount=0;
		int charcount=0;
		while (currentLine != null) {
			linecount++;
			String[] words = currentLine.split(" ");
			  wordcount = wordcount+words.length;
		for (String word : words) {
				 charcount = charcount+word.length();
			}
			currentLine = br.readLine();
		}
		System.out.println("Number of lines="+linecount);
		System.out.println("Number of char="+charcount);
		System.out.println("Number of word="+wordcount);
	}

}