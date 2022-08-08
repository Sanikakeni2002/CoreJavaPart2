package designPattern;

interface Girl {
	String name();

	String country();
}

class AmericanGirl implements Girl {

	@Override
	public String name() {
		return "Emily";
	}

	@Override
	public String country() {
		return "America";
	}

}

public abstract class GirlDecorator implements Girl {
	private Girl newGirl;

	public GirlDecorator(Girl newGirl) {
		this.newGirl = newGirl;
	}
class EuropeanGirl extends GirlDecorator{

	public EuropeanGirl(Girl newGirl) {
		super(newGirl);
	}

	@Override
	public String name() {
		return "Brisa";
	}

	@Override
	public String country() {
		return "Europe";
	}
 class Science implements Girl{

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String country() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}
}
	public static void main(String[] args) {

	}

}
