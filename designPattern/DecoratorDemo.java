package designPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Food {
	String prepareFood();
	double foodPrice();
}

class VegFood implements Food {

	@Override
	public String prepareFood() {
		return "Veg Food";
	}

	@Override
	public double foodPrice() {
		return 50.0;
	}
}

class  FoodDecorator implements Food {
	private Food newFood;

	public FoodDecorator(Food newFood) {
		this.newFood = newFood;
	}

	@Override
	public String prepareFood() {
		return newFood.prepareFood();
	}

	@Override
	public double foodPrice() {
		return newFood.foodPrice();
	}
}

class NonVegFood extends FoodDecorator {

	public NonVegFood(Food newFood) {
		super(newFood);
	}

	public String prepareFood() {
		return super.prepareFood() + "With Roasted chicken and chicken curry";
	}

	public double foodPrice() {
		return super.foodPrice() + 150.0;
	}
}

public class DecoratorDemo {
	private static int choice;

	public static void main(String[] args) throws NumberFormatException, IOException {
		do {
			System.out.println("----------------Food Menu-------------------");
			System.out.println("   1.Vegetarian Food.  ");
			System.out.println("   2.Non Vegetarian Food. ");
			System.out.print("     3. Exit     \n");
			System.out.print("Enter your choice: ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			switch (choice) {
			case 1: {
				VegFood vf = new VegFood();
				System.out.println(vf.prepareFood());
				System.out.println(vf.foodPrice());
			}
				break;

			case 2: {
				Food f1 = new NonVegFood((Food) new VegFood());
				System.out.println(f1.prepareFood());
				System.out.println(f1.foodPrice());
			}
				break;
			default: {
				System.out.println("Other than these no food available");
			}
				return;
			}// end of switch

		} while (choice != 4);
	}
}
