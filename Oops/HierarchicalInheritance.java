package Oops;

class Employee {
	double Salary = 50000;

	void displaySalary() {
		System.out.println("Employee Salary: Rs." + Salary);
	}
}

class Permanent  extends Employee {
	double remain = 0.50;

	void incrementSalary() {
		Salary = Salary + (Salary * remain);
	}
}

class Temporary extends Employee {
	double remain = 0.25;

	void incrementSalary() {
		Salary = Salary + (Salary *remain);
	}
}

class HierarchicalInheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permanent e = new Permanent();
		Temporary e1 = new  Temporary();
		System.out.println("salary of a  Permanent employee before incrementing:");
		e.displaySalary();
		System.out.println("salary of an Temporary employee before incrementing:");
		e1.displaySalary();
		e.incrementSalary();
		e1.incrementSalary();
		System.out.println("salary of a Permanent employee after incrementing:");
		e.displaySalary();
		System.out.println("salary of an Temporary employee after incrementing:");
		e1.displaySalary();
	}

}
