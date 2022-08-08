package Oops;

class Shape {
	public void area() {
		System.out.println("enter a shape name:");
	}
}

class Circle extends Shape {
	int r = 3;
	double pi = 3.14, area;

	public void area() {
		area = pi * r * r;
		System.out.println("Area of Circle: " + area);
	}
}

class Triangle extends Shape {
	int b = 5;
	int h = 8;

	public void area() {
		double area=0.5*(b*h);
		System.out.println("Area of Triangle:"+area);
	}
}

class Rectangle extends Shape {
	int l=7;
	int b=15;
	public void area() {
		int area=l*b;
		System.out.println("Area of Rectangle: "+area);
	}
}

public class HierarchicalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.area();
		Triangle t = new Triangle();
		t.area();
		Rectangle r = new Rectangle();
		r.area();
	}

}
