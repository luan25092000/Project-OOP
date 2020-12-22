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
	
	
	System.out.println("Input date: ");
	Day = sc.nextInt();
	
	System.out.println("Input month: ");
	Month = sc.nextInt();
	
	System.out.println("Input Year: ");
	Year= sc.nextInt();
	
}

public void display_Day() {
	System.out.println("Date " + Day + " Month " + Month+ " Year " + Year);
	
}	

}


