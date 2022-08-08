package Oops;

public class EncapsulationOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnerEx l = new LearnerEx();
		l.setRollNo(101);
		l.setName("Piyu");
		l.setCity("Mumbai");
		System.out.println("Learner's rollNo is: " + l.getRollNo());
		System.out.println("Learner's name is: " + l.getName());
		System.out.println("Learner's city is: " + l.getCity());
	}

}
