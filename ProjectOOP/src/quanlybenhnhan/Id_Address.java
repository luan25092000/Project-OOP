package quanlybenhnhan;
import java.util.Scanner;

public class Id_Address {
	Scanner sc = new Scanner(System.in);

	private int Number;
	private String Street;
	private String District;
	private String City;
	
	public Id_Address() {
		
	}

	public Id_Address(int Number, String Street, String District, String City) {
		
		this.Number = Number;
		this.Street = Street;
		this.District = District;
		this.City = City;
	}
	
	public void insert_Address() {
		System.out.println("Input address: ");
		System.out.println("Apartment Homes: ");
		Number = sc.nextInt();
		sc.nextLine();

		System.out.println("Street: ");
		Street = sc.nextLine();
		
		System.out.println("District/Town-Ward-Province");
		District = sc.nextLine();
		
		System.out.println("City: ");
		City= sc.nextLine();
		
	}
	public void display_Address() {
		
		System.out.println("Address: "+ "No."+Number+" Street "+Street+" District/Town-Ward-Province "+District+" City "+City);
		
	}
	
	
}
