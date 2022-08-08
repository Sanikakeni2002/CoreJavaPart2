package Oops;

class Student2 {
	String name;
	int age;
	String course;

	Student2() { // Non Parameterized Constructor
		name = "Xyz";
		age = 22;
		course = "ABC";
		System.out.println("Non Parameterized Constructor called");
		System.out.println("Name:" + name + ", Age:" + age + ", course: " + course);

	}

	Student2(String name, int age, String course) { // Parameterized Constructor

		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println("Parameterized Constructor called: ");
		System.out.println("Name:" + name + ", Age:" + age + ", course: " + course);

	}

	Student2(Student1 stu) { // Copy Constructor

		name = stu.name;
		age = stu.rollNo;
		course = stu.name;
		System.out.println("Copy Constructor called: ");
		System.out.println("Name:" + name + ", Age:" + age + ", course: " + course);

	}
}

public class AllConstructors {

	public static void main(String[] args) {
		// Non Parameterized Constructor
		Student2 s1 = new Student2();
		// Parameterized Constructor
		Student2 s2 = new Student2("Sanika", 20, "Java FullStack Development");
		// Copy Constructor
		Student2 s3 = new Student2();

	}

}


