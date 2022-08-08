package exception;

public class UserDefinedException extends Exception {
	private int ex;

	public UserDefinedException(int a) {
		ex = a;
	}

	public String toString() {
		return "UserDefinedException[" + ex + "] is less than zero";
	}
}

class Test {
	static void sum(int a, int b) throws UserDefinedException {
		if (a < 0) {
			throw new UserDefinedException(a);
		} else {
			System.out.println(a + b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sum(-10, 10);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
