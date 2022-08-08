package Oops;//counter without static variable

/*class Counter{
	int count=0;
	Counter(){
		count++;
		System.out.println(count);
	}
}
public class StaticCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
	}
}*/
// counter by static variable
class Counter1 {
	static int count = 0;

	Counter1() {
		count++;
		System.out.println(count);
	}
}

public class StaticCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter1 c1 = new Counter1();
		Counter1 c2 = new Counter1();
		Counter1 c3 = new Counter1();
	}
}
