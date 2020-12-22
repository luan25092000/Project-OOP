package quanlybenhnhan;
import java.util.Scanner;

public class Checkout_Day extends Id_Day {
	Scanner sc = new Scanner(System.in);
	private int Id_Hour;
	private int Id_Minute;
	
	public int getId_Hour() {
		return Id_Hour;
	}

	public void setId_Hour(int id_Hour) {
		Id_Hour = id_Hour;
	}

	public int getId_Minute() {
		return Id_Minute;
	}

	public void setId_Minute(int id_Minute) {
		Id_Minute = id_Minute;
	}

	public Checkout_Day() {
		
	}

	public Checkout_Day(int Year, int Month, int Day, int Id_Hour, int Id_Minute) {
		super(Year,Month,Day);
		this.Id_Hour = Id_Hour;
		this.Id_Minute = Id_Minute;
		
	}
	
	public void insert_Checkout() {
		
			System.out.println("------ Checkout input -----");
			super.insert_Day();

			System.out.println("Input hours: ");
			Id_Hour = sc.nextInt();
			
			System.out.println("Input minutes: ");
			Id_Minute= sc.nextInt();
		
		
	}
	
	public void display_Checkout() {
		System.out.println("------ Checkout -----");
		super.display_Day();
		System.out.println("Checkout date: "+Day+"/"+Month+"/"+Year);
		System.out.println("time: "+ Id_Hour +" h" + Id_Minute + " m" );
	}
	
		

}
