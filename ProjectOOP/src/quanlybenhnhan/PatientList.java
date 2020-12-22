package quanlybenhnhan;

import java.util.Scanner;
import java.util.ArrayList;

public final class PatientList {
	private static ArrayList<Info> patientList= new ArrayList<Info>();
	static Scanner sc = new Scanner(System.in);

	private static int n;
	// Check if list is empty
	public static boolean isEmptyList() {
        return (patientList.size() == 0);
	}
	// Check id on list
	public static boolean isIdExisted(String id) {
		for(int i = 0; i < patientList.size();i++) {
			if(patientList.get(i).getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	// find index of patient
	public static int index(String id){
		for(int i = 0; i < patientList.size(); i++ ){
			if(patientList.get(i).getId().equals(id)) {
				return i;
			}
		}
		return 0;
	}
	
	// TAO DANH SACH BENH NHAN
		public static void createPatient() {
			System.out.println("SO LUONG BENH NHAN CAN NHAP THONG TIN ");
			n = sc.nextInt();
			
			for(int i = 0;i<n;i++) {
				System.out.println("NHAP DU LIEU CHO BENH NHAN THU "+(i+1));
				Info p = new Info();
				p.setId(i+1);
				p.insertInfo();
				patientList.add(p);
			}
					
			// HIEN THI DANH SACH DA THEM VAO
			for(int i=0;i<patientList.size();i++)
			{
				patientList.get(i).displayInfo();
			}
		}
	
	public static void deletePatient(String id) {
		if(isEmptyList()) {
			System.out.println("Need to add patient info first!!!");
		}
		else {
			if(isIdExisted(id)) {
				System.out.println("index: " + patientList.get(index(id)));
				patientList.remove(patientList.get(index(id)));
				System.out.println("Patient removed successfully!!!");
			}
			else {
				System.out.println("Patient doesn't exist!!!");
			}
		}
	}
	
	// CHINH SUA THONG TIN BENH NHAN THEO MA BENH NHAN
	public static void editPatient() {
		System.out.println("NHAP MA SO BENH NHAN CAN CHINH SUA: ");
		int id=sc.nextInt();
		boolean check =false;
		if(isEmptyList()) {
			System.out.println("Need to add patient info first!!!");
		}
		else {
			for (int i=0;i<n;i++) {
				if( id == patientList.get(i).getId()){
					check=true;
					System.out.println("NHAP THONG TIN BENH NHAN CAN CHINH");
					System.out.print("Ho ten benh nhan "+patientList.get(i).getName()+" -> ");
					patientList.get(i).setName(editName());
					System.out.print("Gioi tinh benh nhan "+patientList.get(i).getGender()+" -> ");
					patientList.get(i).setGender(editGender());
					patientList.get(i).b.display_Bday();
					System.out.print(" -> ");
					patientList.get(i).b.insert_Bday();
					patientList.get(i).a.display_Address();
					System.out.print(" -> ");
					patientList.get(i).a.insert_Address();
					patientList.get(i).ci.display_Checkin();
					System.out.print(" -> ");
					patientList.get(i).ci.insert_Checkin();
					patientList.get(i).co.display_Checkout();
					System.out.print(" -> ");
					patientList.get(i).co.insert_Checkout();
					
				}
			}
			if (!check) {
				System.out.println("MA BENH NHAN KHONG HOP LE! ");
			}
			else {
				for (int i=0;i<n;i++) {
					System.out.println("DU LIEU CUA BENH NHAN THU "+(i+1));
					patientList.get(i).displayInfo();
				}
			}
		}
	}
	private static String editId() {
        System.out.print("Nhap MSBN moi: ");
        return sc.next();
	}
	private static String editName() {
		System.out.print("Nhap Ho ten moi: ");
		return sc.next();
	}
	private static String editGender() {
		System.out.print("Nhap Gioi tinh moi: ");
		return sc.next();
	}
	
}