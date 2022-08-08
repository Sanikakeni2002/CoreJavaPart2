package designPattern;

public class BehavioralDesign {
	public void cookPasta() {
		System.out.println("Chef is cooking Chicken Alfredo…");
	}

	public void bakeCake() {
		System.out.println("Chef is baking Chocolate Fudge Cake…");
	}
}
 interface Command {
	public abstract void execute();
}
 class Order implements Command {
		private BehavioralDesign chef;
		private String food;

		public Order(BehavioralDesign chef, String food) {
			this.chef = chef;
			this.food = food;
		}

		@Override
		public void execute() {
			if (this.food.equals("Pasta")) {
				this.chef.cookPasta();
			} else {
				this.chef.bakeCake();
			}
		}
	}
 class Waiter {
		private Order order;

		public Waiter(Order ord) {
			this.order = ord;
		}

		public void execute() {
			this.order.execute();
		}
	}
 class Client {
		public static void main(String[] args) {
			BehavioralDesign chef = new BehavioralDesign();
	        
			Order order = new Order(chef, "Pasta");
			Waiter waiter = new Waiter(order);
			waiter.execute();

			order = new Order(chef, "Cake");
			waiter = new Waiter(order);
			waiter.execute();
		}
	}