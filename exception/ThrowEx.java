package exception;

class ThrowEx1 {
	static void validate(int age) {
		if (age < 18)
			throw new ArithmeticException("not valid");
		else
			System.out.println("welcome to vote");
	}
}
	public  class ThrowEx{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowEx1.validate(20);
		System.out.println("rest of the code");
	}
	}

	
