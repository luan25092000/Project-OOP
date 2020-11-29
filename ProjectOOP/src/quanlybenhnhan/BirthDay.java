package quanlybenhnhan;

public class BirthDay extends Id_Day {
	
	public BirthDay()
	{
		super();
	}
	
	public BirthDay(int Year, int Month, int Day) {
		super(Year,Month,Day);
	}

	public void insert_Bday() {
		System.out.println("----------NHAP THONG TIN NGAY THANG NAM SINH-------------");
		super.insert_Day();
	}
	
	public void display_Bday() {
		System.out.println("------- NGAY THANG NAM SINH -------");
		super.display_Day();
		System.out.println("BENH NHAN SINH NGAY "+Day+"/"+Month+"/"+Year);
	}
	
}
