package exception;

import java.util.Scanner;

class InvalidNameException extends Exception {
	public InvalidNameException(String s) {
		super(s);
	}

	static class InvalidNameCustomExceptionRunner {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			InvalidNameCustomExceptionRunner obj=new InvalidNameCustomExceptionRunner();
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter your first name: ");
			String firstname= sc.nextLine();
		}
	}
}
