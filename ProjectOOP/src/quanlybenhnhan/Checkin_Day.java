package quanlybenhnhan;

import java.util.Scanner;
public class Checkin_Day extends Id_Day {
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

	public Checkin_Day() {
		
	}

	public Checkin_Day(int Year, int Month, int Day, int Id_Hour, int Id_Minute) {
		super();
		this.Id_Hour = Id_Hour;
		this.Id_Minute = Id_Minute;
		
	}
	
	public void insert_Checkin() {
		System.out.println("----- Checkin input -----");

		super.insert_Day();
		System.out.println("Input hours: ");
		Id_Hour = sc.nextInt();
		
		System.out.println("Input minutes: ");
		Id_Minute= sc.nextInt();
	}
	
	public void display_Checkin() {
		System.out.println("----- Checkin -----");
		super.display_Day();
		System.out.println("Checkin date: "+Day+"/"+Month+"/"+Year);
		System.out.println("Time: "+ Id_Hour +"h" + Id_Minute + "m" );
	}
	
	

}
