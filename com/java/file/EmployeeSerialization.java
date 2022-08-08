package com.java.file;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("G://abc.txt");
		ObjectOutputStream obj = new ObjectOutputStream(fos);
		Employee e = new Employee();
		e.id = 1;
		e.name = "xyz";
		e.city = "Mumbai";
		obj.writeObject(e);
		System.out.println("Data is saved");
	}
}
