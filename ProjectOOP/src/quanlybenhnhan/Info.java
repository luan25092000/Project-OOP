package quanlybenhnhan;
import java.util.Scanner;

public class Info {
	Scanner sc = new Scanner(System.in);
	Id_Address a = new Id_Address();
	Checkin_Day ci = new Checkin_Day();
	Checkout_Day co = new Checkout_Day();
	BirthDay b = new BirthDay();
	private int Id;
	private String Name;
	private String Gender;
	private Id_Address Address;
	private String Phone;
	
	
	
	public Info() {
		
	}
		

	public Info(int Id,String Name, String Gender) {
		this.Name = Name;
		this.Id = Id;
		this.Gender = Gender;
	}
	
	

	public  int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}




	public void insertInfo() {
		getId();
		System.out.println("ID:" +Id );
		System.out.println("Input patient name: ");
		Name = sc.next();
		sc.nextLine();
		System.out.println("Input gender: ");
		Gender = sc.next();
		b.insert_Bday();
		a.insert_Address();
		ci.insert_Checkin();
		co.insert_Checkout();
		
		
	}

	public void display_CV() {
		System.out.println("Patient Info [ID=" + Id + ", Name=" + Name + ", Gender=" + Gender + "]");
	}

	public void displayInfo() {
		display_CV();
		a.display_Address();
		b.display_Bday();
		ci.display_Checkin();
		co.display_Checkout();
	}
}