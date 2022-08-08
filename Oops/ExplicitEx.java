package Oops;//explicit type conversion "we have to build this"

public class ExplicitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 32.25;
		float f = (float) d;
		long l = (long) f;
		int i = (int) l;
		short s = (short) i;
		byte b = (byte) s;
		System.out.println("double value: "+d);
		System.out.println("float value: "+f);
		System.out.println("long value: "+l);
		System.out.println("int value: "+i);
		System.out.println("short value: "+s);
		System.out.println("byte value: "+b);

	}

}
