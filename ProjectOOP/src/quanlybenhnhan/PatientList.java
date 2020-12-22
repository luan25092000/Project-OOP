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
	public static boolean isIdExisted(int id) {
		for(int i = 0; i < patientList.size();i++) {
			if(patientList.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}

	// find index of patient
	public static int index(int id){
		for(int i = 0; i < patientList.size(); i++ ){
			if(patientList.get(i).getId() == id) {
				return i;
			}
		}
		return 0;
	}
	
	// Create patient list
	public static void createPatient() {
			System.out.println("Needed number for adding patients: ");
			n = sc.nextInt();
			
			for(int i = 0;i<n;i++) {
				System.out.println("Patient data: "+(i+1));
				Info p = new Info();
				p.setId(i+1);
				p.insertInfo();
				patientList.add(p);
			}
					
			// Show patient list
			for(int i=0;i<patientList.size();i++)
			{
				patientList.get(i).displayInfo();
			}
		}
	
	// Delete patient from array list
	public static void deletePatient(int id) {
		// Check empty list
		if(isEmptyList()) {
			System.out.println("Need to add patient info first!!!");
		}
		else {
			// Check id
			if(isIdExisted(id)) {
				patientList.remove(patientList.get(index(id)));
				System.out.println("Patient removed successfully!!!");
			}
			else {
				System.out.println("Patient doesn't exist!!!");
			}
			//Show list
			for(int i=0;i<patientList.size();i++){
				patientList.get(i).displayInfo();
			}
		}
	}
	
	// CHINH SUA THONG TIN BENH NHAN THEO MA BENH NHAN
	public static void editPatient() {
		System.out.println("Patient ID for editing: ");
		int id=sc.nextInt();
		boolean check =false;
		if(isEmptyList()) {
			System.out.println("Need to add patient info first!!!");
		}
		else {
			for (int i=0;i<n;i++) {
				if( id == patientList.get(i).getId()){
					check=true;
					System.out.println("Editing patient: " + id);
					System.out.print("Name: "+patientList.get(i).getName()+" -> ");
					patientList.get(i).setName(editName());
					System.out.print("Gender: "+patientList.get(i).getGender()+" -> ");
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
				System.out.println("Invalid ID!!!");
			}
			else {
				for (int i=0;i<n;i++) {
					System.out.println("Patient: "+(i+1));
					patientList.get(i).displayInfo();
				}
			}
		}
	}

	private static String editName() {
		System.out.print("New name: ");
		return sc.next();
	}
	private static String editGender() {
		System.out.print("New gender: ");
		return sc.next();
	}
	
}