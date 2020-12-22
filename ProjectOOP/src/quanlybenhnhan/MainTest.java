package quanlybenhnhan;
import java.util.Scanner;
import java.util.Arrays;

public class MainTest {
	static Scanner sc = new Scanner(System.in);	
	public static void main(String args[]) {
		MainTest m = new MainTest();
		
		int c;
		
		do {
			System.out.println("-----------------");
			System.out.println("1.......Insert and show patient list");
			System.out.println("2...... Edit patient info");
			System.out.println("3.......Delete patient info");
			System.out.println("----- CHON ------");
			c = sc.nextInt();
			sc.nextLine();
			switch(c) {
			
			case 1:
				System.out.println("1.......Insert and show patient list");
				PatientList.createPatient();
				break;
			case 2:
				System.out.println("2...... Edit patient info");
				PatientList.editPatient();
				break;
			case 3:
				System.out.println("3.......Delete patient info");
				System.out.print("Delete patient with ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				PatientList.deletePatient(id);
				break;
			}
			
			
		}while(c<4);
		
		
		
		
	}

}