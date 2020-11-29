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
		System.out.println("THONG TIN -----NHAP VIEN-----");

		super.insert_Day();
		System.out.println("NHAP GIO ");
		Id_Hour = sc.nextInt();
		
		System.out.println("NHAP PHUT");
		Id_Minute= sc.nextInt();
	}
	
	public void display_Checkin() {
		System.out.println("-----NHAP VIEN-----");
		super.display_Day();
		System.out.println("BENH NHAN NHAP VIEN NGAY "+Day+"/"+Month+"/"+Year);
		System.out.println("BENH NHANH NHAP VIEN LUC "+ Id_Hour +" GIO" + Id_Minute + " PHUT" );
	}
	
	

}
