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
		System.out.println("NHAP THONG TIN DIA CHI");
		System.out.println("NHAP SO NHA");
		Number = sc.nextInt();
		sc.nextLine();

		System.out.println("NHAP TEN DUONG");
		Street = sc.nextLine();
		
		System.out.println("NHAP QUAN/HUYEN/PHUONG");
		District = sc.nextLine();
		
		System.out.println("NHAP THANH PHO");
		City= sc.nextLine();
		
	}
	public void display_Address() {
		
		System.out.println("THONG TIN DIA CHI "+ "SO  "+Number+" DUONG "+Street+" QUAN/HUYEN/PHUONG "+District+" THANH PHO "+City);
		
	}
	
	
}
