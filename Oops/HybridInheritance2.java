package Oops;

interface InterA {
	void displayA();
}

interface InterB extends InterA {
	void displayB();
}

interface InterC extends InterA {
	void displayC();
}

class D implements InterB, InterC {

	@Override
	public void displayA() {
		// TODO Auto-generated method stub
		System.out.println("Display method A");
	}

	@Override
	public void displayC() {
		// TODO Auto-generated method stub
		System.out.println("Display method C");
	}

	@Override
	public void displayB() {
		// TODO Auto-generated method stub
		System.out.println("Display method B");
	}

}

public class HybridInheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.displayA();
		d.displayB();
		d.displayC();
	}

}
