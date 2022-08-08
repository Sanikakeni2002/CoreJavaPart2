package com.java.file;

import java.io.File;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 {
	File myObj= new File("G://abc.txt");
	if(myObj.exists()){
		System.out.println("File name: "+myObj.getName());
		System.out.println("Absolute path: "+myObj.getAbsolutePath());
		System.out.println("Writable: "+myObj.canWrite());
		System.out.println("Readable "+myObj.canRead());
		System.out.println("File sizes in bytes "+myObj.length());
	}else{
		System.out.println("The file does not exist!");
	}
}
	}

}
