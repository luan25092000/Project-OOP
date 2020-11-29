package quanlybenhnhan;

import java.util.Scanner;

public class Id_Day {
	
	Scanner sc = new Scanner(System.in);

	protected int Year ;
	protected int Month;
	protected int Day;


public Id_Day() {
	
}


public Id_Day(int Year, int Month, int Day) {
	
	this.Year = Year;
	this.Month = Month;
	this.Day = Day;
}

public void insert_Day() {
	
	
	System.out.println("NHAP NGAY");
	Day = sc.nextInt();
	
	System.out.println("NHAP THANG");
	Month = sc.nextInt();
	
	System.out.println("NHAP NAM");
	Year= sc.nextInt();
	
}

public void display_Day() {
	System.out.println("NGAY " + Day + " THANG " + Month+ " NAM " + Year);
	
}	

}


