package Oops;

	class pqr {
		int a, b;

		void getdata() {
			a = 10;
			b = 20;
		}
	}

	class sum extends pqr {
		int sum;

		void sum() {
			sum = a + b;
			System.out.println("\nSum= " + sum);
		}
	}

	class subt extends sum {
		int subt;

		void subtract() {
			subt = a - b;
			System.out.println("\nSubtraction= " + subt + "\n");
		}
	}

	class MultilevelInheritance {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			subt s = new subt();
			s.getdata();
			s.sum();
			s.subtract();
		}
	}

