package quanlybenhnhan;
import java.util.Scanner;

public class Info {
	Scanner sc = new Scanner(System.in);
	Id_Address a = new Id_Address();
	Checkin_Day ci = new Checkin_Day();
	Checkout_Day co = new Checkout_Day();
	BirthDay b = new BirthDay();
	private String Id;
	private String Name;
	private String Gender;
	private Id_Address Address;
	private String Phone;
	
	
	
	public Info() {
		
	}
		

	public Info(String Name,String Phone, String Id, Id_Address Address, String Gender) {
		this.Name = Name;
		this.Phone = Phone;
		this.Id = Id;
		this.Address = Address;
		this.Gender = Gender;
	}
	
	


	public String getId() {
		return Id;
	}


	public void setId(String id) {
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


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


	public void insertInfo() {
		
		System.out.println("NHAP MSBN " );
		Id = sc.next();
		System.out.println("NHAP HO TEN BENH NHAN ");
		Name = sc.next();
		sc.nextLine();
		System.out.println("NHAP GIOI TINH ");
		Gender = sc.next();
		b.insert_Bday();
		a.insert_Address();
		ci.insert_Checkin();
		co.insert_Checkout();
		
		
	}

	@Override
	public String toString() {
		return "THONG TIN BENH NHAN [ID=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Address=" + Address
				+ ", Phone=" + Phone + "]";
		
	}
	public void display_CV() {
		System.out.println("THONG TIN BENH NHAN [ID=" + Id + ", Name=" + Name + ", Gender=" + Gender + ", Address=" + Address+ ", Phone=" + Phone + ")");
	}

	public void displayInfo() {
		display_CV();
		a.display_Address();
		b.display_Bday();
		ci.display_Checkin();
		co.display_Checkout();
	}

	
	
	
	

}
