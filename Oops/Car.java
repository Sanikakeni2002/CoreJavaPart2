package Oops;//write a constructor in the car class given below that initialize the brand class field with the string "Ford", call the getBrand()
//method of the sample class and store the value of the brand in a variable and print the value.
public class Car {
	String s;

	Car() {
		s = "Ford";
		System.out.println(s);
	}

	void getbrand() {
		System.out.println("Brand= " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.getbrand();

	}

}
