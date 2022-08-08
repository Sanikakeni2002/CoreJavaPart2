package Oops;

class Bike1 {
	 void run() {//final occur error
		System.out.println("running");
	}
}

class Honda extends Bike1 {
	void run() {
		System.out.println("running safely with 100kmph");
	}
}

class FinalEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Honda h = new Honda();
		h.run();
	}

}
