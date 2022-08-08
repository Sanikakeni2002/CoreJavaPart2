package com.java.file;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeserialization {

	public static void main(String[] args) throws  IOException, ClassNotFoundException{
		FileInputStream fois=new FileInputStream("G://abc.txt");
		ObjectInputStream obj= new ObjectInputStream(fois);
		Employee e=(Employee) obj.readObject();
		System.out.println("Employee details are: "+"Id "+e.id+" Name "+e.name+" City "+e.city);

	}

}
