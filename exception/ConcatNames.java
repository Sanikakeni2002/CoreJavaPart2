package exception;

class ConcatNames extends Exception {
	public ConcatNames(String s) {
		super(s);
	}
}
	class FirstLastNameExp {
		void checkNames(String fname, String lname) throws ConcatNames {
			if (fname == null && lname == null) {
				throw new ConcatNames("Invalid Name");
			} else {
				System.out.println(fname.concat(lname));
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstLastNameExp f = new FirstLastNameExp();
		try {
			f.checkNames(null, "Keni");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}
	}

}
