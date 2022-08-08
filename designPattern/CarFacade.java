package designPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Car{
	public void build();
}
class Chevrolet implements Car{

	@Override
	public void build() {
		System.out.println("This is Chevrolet");
	}
}
class BMW implements Car{

	@Override
	public void build() {
		System.out.println("This is BMW");
	}
	
}
class Renault implements Car{

	@Override
	public void build() {
		System.out.println("This is Renault");
	}
}
class FacadeForCar {
	private Car chevrolet;
	private Car bmw;
	private Car renault;
	
	public FacadeForCar(){
		chevrolet= new Chevrolet();
		bmw = new BMW();
		renault =new Renault();
	}
	public void buildChevrolet(){
		chevrolet.build();
	}
	public void buildBmw(){
		bmw.build();
	}
	public void buildRenault(){
		renault.build();
	}
}
public class CarFacade {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int choice;
		do{
			System.out.println("------------------Car Shop----------------------------");
			System.out.println("        1.Chevrolet  /n");
			System.out.println("        2.BMW /n");
			System.out.println("        3.Renault /n");
			System.out.println("        4.Exit    ");
			System.out.println("Enter your choice: ");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(br.readLine());
			FacadeForCar cf=new FacadeForCar();
			
			switch(choice){
			case 1:
				cf.buildChevrolet();
				break;
				
			case 2:
				cf.buildBmw();
				break;
				
			case 3:
				cf.buildRenault();
				break;
				
				default:{
					System.out.println("Nothing you purchased!!!");
				}
				return;
			}
		}while(choice!=4);


}
}