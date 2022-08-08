package designPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrototypeEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter employee id: ");
		int id=Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter employee name: ");
		String name=br.readLine();
		

		System.out.println("Enter employee designation: ");
		String designation=br.readLine();
		
		
		System.out.println("Enter employee address: ");
		String address=br.readLine();
		
		
		System.out.println("Enter employee salary: ");
		double salary=Double.parseDouble(br.readLine());
		
		System.out.println("Employee details are: ");
		System.out.println("-------------------------------------------------------");
		EmployeeRecord e1=new EmployeeRecord(id, name, designation,salary,address);
		e1.showRecord();
		System.out.println("Employee records of oracle corporation");
		System.out.println("-------------------------------------------------------");
		
		EmployeeRecord e2=(EmployeeRecord) e1.getClone();
		e2.showRecord();
	}

}
