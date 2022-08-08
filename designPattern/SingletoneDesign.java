package designPattern;

class Database {
	private static Database dbObject;

	private Database() {

	}

	public static Database getInstance() {
		if (dbObject == null) {
			dbObject = new Database();
		}
		return dbObject;

	}

	public void getConnection() {
		System.out.println("You are now connected to the database ");
	}
}

public class SingletoneDesign {

	public static void main(String[] args) {
		Database d1;
		d1 = Database.getInstance();
		d1.getConnection();

	}

}
