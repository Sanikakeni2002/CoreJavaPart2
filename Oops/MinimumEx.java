package Oops;

class MinimumEx1 {
	public static int minFunction(int n1, int n2) {
		int min = 0;
		if (n1 > n2) {
			min = n2;
		} else {
			min = n1;
		}
		return min;
	}

	public static double minFunction(double n3, double n4) {
		double min = 0.0;
		if (n3 > n4) {
			min = n4;
		} else {
			min = n3;
		}
		return min;
	}}
  class MinimumEx {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int n1 = 15, n2 = 17;
			double n3 = 55.2, n4 = 21.8;
			int result1 = MinimumEx1.minFunction(n1, n2);
			double result2 = MinimumEx1.minFunction(n3, n4);
			System.out.println("The minimum value of integer types= " + result1);
			System.out.println("The minimum value of double types= " + result2);
		}
	
}
