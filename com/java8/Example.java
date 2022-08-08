package com.java8;

@FunctionalInterface
interface MyInterfaces{
	void display();
}
public class Example {
public void myMethod(){
	System.out.println("Instance Method");
}
	public static void main(String[] args) {
		Example e=new Example();
		e.myMethod();//method reference using the object of the class

		MyInterfaces ref= e::myMethod;
		ref.display();//calling the method of functional interface
	}

}
