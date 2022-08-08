package exception;

import java.util.Scanner;

class NameNotFoundException extends Exception {
	public NameNotFoundException(String s) {
		super(s);
	}

	static class NameNotExistExceptionRunner {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String[] names = { "Sanika", "Mayuri", "Piyu", "Savita", "Manisha" };
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your name: ");
			String name1 = sc.nextLine();
			try {
				checkNameExist(name1, names);
			} catch (NameNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

		private static void checkNameExist(String name, String[] names) throws NameNotFoundException {
			boolean flag = false;
			for (String str : names) {
				if (name.equalsIgnoreCase(str)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("Name exist");
			} else {
				throw new NameNotFoundException("Name not exist");
			}
		}
	}
}
