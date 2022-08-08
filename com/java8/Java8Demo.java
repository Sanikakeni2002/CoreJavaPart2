package com.java8;

public class Java8Demo  implements MyInterfaceDemo{
public void simpleMethod(String str){
	System.out.println("This is simple method "+str);
}
	public static void main(String[] args) {
		Java8Demo j=new Java8Demo();
		j.simpleMethod("Piyu");
		j.defaultMethod();
		MyInterfaceDemo.staticMethod("Mayuri");
		
	}
	private void defaultMethod() {
		// TODO Auto-generated method stub	
	}
}
