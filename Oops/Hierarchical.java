package Oops;

class Maruti {
	public void methodMaruti() {
		System.out.println("method of Class Maruti");
	}
}

class BMW extends Maruti {
	public void methodBMW() {
		System.out.println("method of Class BMW");
	}
}

class Suzuki extends Maruti {
	public void methodSuzuki() {
		System.out.println("method of Class Suzuki");
	}
}

class Hierarchical {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b = new BMW();
		Suzuki b1 = new Suzuki();
		b.methodMaruti();
		b1.methodMaruti();
	}

}
