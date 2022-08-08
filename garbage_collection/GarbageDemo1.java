package garbage_collection;

public class GarbageDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageDemo1 gd=new GarbageDemo1();
		gd=null;
		String string = new String("Hello");
		string = null;
		System.gc();
		System.out.println("\t I am in main method");
	}

	protected void finalize() {
		System.out.println("\t I am overriding finalize method");
	}
}
