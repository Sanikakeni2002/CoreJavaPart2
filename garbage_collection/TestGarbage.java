package garbage_collection;

public class TestGarbage {
	 public void finalize()
	 {
		 System.out.println("object is garbage collected");
     }  
	 public static void main(String args[]){  
	  TestGarbage s1=new TestGarbage();  
	  TestGarbage s2=new TestGarbage();  
	  s1=s2;
	  System.gc();  
}
}