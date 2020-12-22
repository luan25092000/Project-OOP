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
		System.out.println("---------- Date of birth -------------");
		super.insert_Day();
	}
	
	public void display_Bday() {
		System.out.println("------- Date of birth -------");
		super.display_Day();
		System.out.println("Date: "+Day+"/"+Month+"/"+Year);
	}
	
}
