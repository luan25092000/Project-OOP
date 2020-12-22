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
	public static boolean isIdExisted(int id) {
		for(int i = 0; i < patientList.size();i++) {
			if(patientList.get(i).getId() == id) {
				return true;
			}
		}
		return false;
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
	

}