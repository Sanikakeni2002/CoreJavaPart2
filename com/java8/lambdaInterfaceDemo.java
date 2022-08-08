package com.java8;

@FunctionalInterface
interface MyFunctionalInterface1{
	public String sayHello();
}

interface MyInterface2{
	public String sayEvenOdd(int num);
}
@FunctionalInterface
interface MyInterface3{
	public int add(int a, int b);
}

public class lambdaInterfaceDemo {

	public static void main(String[] args) {
		MyFunctionalInterface1 msg1=()->{
			return "I am empty msg";
		};
		System.out.println("Zero parameter: "+msg1.sayHello());
		MyInterface2 msg2=(num)->{
			if(num%2== 0){
				return "Even";
			}else{
				return "Odd";
			}
		};
		System.out.println("Check Even or Odd: "+msg2.sayEvenOdd(12));
		MyInterface3 msg3= (a,b)->{
			return(a+b);
		};
		System.out.println("Addition of numbers: "+msg3.add(20, 30));
	}

}
