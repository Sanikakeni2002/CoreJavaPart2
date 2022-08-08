package exception;

public class NullEx {
	public static void main(String[] args) {
		try {
			String str="sanika";
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
