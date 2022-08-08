package designPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


interface MobileShop{
	public void getMobilePrice();
	public void getModelNo();
}
class Iphone implements MobileShop{

	@Override
	public void getMobilePrice() {
		System.out.println("Rs.95000.00");
	}

	@Override
	public void getModelNo() {
		System.out.println("Iphone 12");
	}
}
class Samsung implements MobileShop{

	@Override
	public void getMobilePrice() {
		System.out.println("Rs.32000");
	}

	@Override
	public void getModelNo() {
		System.out.println("Samsung galaxy tab 3");
	}
}
class Nokia implements MobileShop{

	@Override
	public void getMobilePrice() {
		System.out.println("Rs.13,999");
	}

	@Override
	public void getModelNo() {
		System.out.println("Nokia G21");
	}
}
class ShopKeeper{
	private MobileShop iphone;
	private MobileShop samsung;
	private MobileShop nokia;
	
	public ShopKeeper(){
		iphone=new Iphone();
		samsung=new Samsung();
		nokia=new Nokia();
	}
	public void iphoneSale(){
		iphone.getMobilePrice();
		iphone.getModelNo();
	}
	public void samsungSale(){
		samsung.getMobilePrice();
		samsung.getModelNo();
	}
	public void nokiaSale(){
		nokia.getMobilePrice();
		nokia.getModelNo();
	}
}
public class FacadeDemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		do{
			System.out.println("------------------Mobile Shop----------------------------");
			System.out.println("        1.Iphone  /n");
			System.out.println("        2.Samsung /n");
			System.out.println("        3.Nokia /n");
			System.out.println("        4.Exit    ");
			System.out.println("Enter your choice: ");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			ShopKeeper sk=new ShopKeeper();
			
			switch(choice){
			case 1:
				sk.iphoneSale();
				break;
				
			case 2:
				sk.samsungSale();
				break;
				
			case 3:
				sk.nokiaSale();
				break;
				
				default:{
					System.out.println("Nothing you purchased!!!");
				}
				return;
			}
		}while(choice!=4);

	}

}
