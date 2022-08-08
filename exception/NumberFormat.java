package exception;

public class NumberFormat {

	public static void main(String[] args) {

		try {
			String s = "123";
			//System.out.println(s.length());
			int i = Integer.parseInt(s);
			System.out.println("String format:"+i);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
