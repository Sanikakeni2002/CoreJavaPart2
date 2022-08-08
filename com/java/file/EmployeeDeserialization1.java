package com.java.file;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class EmployeeDeserialization1 {

	public static void main(String[] args) throws IOException,  ClassNotFoundException{
		FileInputStream fois=new FileInputStream("G://abc.txt");
		ObjectInputStream obj= new ObjectInputStream(fois);
		Employee e1=(Employee) obj.readObject();
		Employee e2=(Employee) obj.readObject();
		Employee e3=(Employee) obj.readObject();
		System.out.println("Employee details are: ");
		System.out.println("\nId: "+ e1.getId()+ "\nName:"+ e1.name+ "\nCity:"+ e1.city);
		System.out.println("\nId: "+ e2.getId()+ "\nName:"+ e2.name+ "\nCity:"+ e2.city);
		System.out.println("\nId: "+ e3.getId()+ "\nName:"+ e3.name+ "\nCity:"+ e3.city);
	}

}
