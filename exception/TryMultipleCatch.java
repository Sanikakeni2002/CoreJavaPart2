package exception;

public class TryMultipleCatch {

	public static void main(String[] args)  {
		try {
			String s=null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds exception");
		}catch(Exception e)   {  
            System.out.println("Exception occurs");  
           }    
		finally{
			System.out.println("rest of the code ");
		}
	}
	
}
