package Oops;//single inheritance
	class Learner {
		float fees = 40000;
	}

	class learners extends Learner {
		int assesment = 3;
	}
class SingleInheritance{
	public static void main(String[] args) {
		learners l = new learners();
		System.out.println("Learners fees is:" + l.fees);
		System.out.println("Assesment of learners is:" + l.assesment);
	}

}
