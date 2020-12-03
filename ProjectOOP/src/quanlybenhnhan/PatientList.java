package quanlybenhnhan;

import java.util.ArrayList;

public final class PatientList {
	private static ArrayList<Info> patientList= new ArrayList<Info>();
	// Check if list is empty
	public static boolean isEmptyList() {
        return (patientList.size() == 0);
    }
	public static boolean isIdExisted(String id) {
		for(int i = 0; i < patientList.size();i++) {
			if(patientList.get(i).getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public static void deletePatient(String id) {
		if(isEmptyList()) {
			System.out.println("Need to add patient info first!!!");
		}
		else {
			if(isIdExisted(id)) {
				 patientList.remove(patientList.indexOf(id));
				 System.out.println("Patient removed successfully!!!");
			}
			else {
				System.out.println("Patient doesn't exist!!!");
			}
		}
	}

}
