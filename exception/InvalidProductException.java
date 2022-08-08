package exception;

class InvalidProductException extends Exception {
	public InvalidProductException(String s) {
		super(s);
	}
}
	class ProductCustomException {
		void productCheck(int weight) throws InvalidProductException {
			if (weight < 100) {
				throw new InvalidProductException("Product Invalid");
			}
		}
	

	public static void main(String[] args) {
		ProductCustomException p = new ProductCustomException();
		try {
			p.productCheck(60);
		} catch (InvalidProductException e) {
			// TODO: handle exception
			System.out.println("Caught the exception");
			System.out.println(e.getMessage());
		}

	}

}