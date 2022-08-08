package garbage_collection;

public class GarbageDemo {

	public static void main(String[] args) {
		GarbageDemo gd = new GarbageDemo();
		gd = null;
		System.gc();
		System.out.println("\tMain Method");
	}

	protected void finalize() {
		System.out.println("\t Overriding method");
	}
}
