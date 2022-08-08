package Oops;
interface C{
	 void displayA();
	 
interface A extends C{
		public void displayB();
	}

interface B extends C{
		public void displayC();
	}

	class D implements C,A,B{

		@Override
		public void displayB() {
			// TODO Auto-generated method stub
			System.out.println("B");
		}

		@Override
		public void displayC() {
			// TODO Auto-generated method stub
			System.out.println("C");
		}

		@Override
		public void displayA() {
			// TODO Auto-generated method stub
			System.out.println("A");
		}
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		d.displayA();
		d.displayB();
		d.displayC();
		
	}
		
	}

