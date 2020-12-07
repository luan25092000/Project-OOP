package quanlybenhnhan;
import java.util.Scanner;
import java.util.Arrays;

public class MainTest {
	static Scanner sc = new Scanner(System.in);	
	public static void main(String args[]) {
		MainTest m = new MainTest();
		
		int c;
		
		do {
			System.out.println("1.......NHAP VA HIEN THI DANH SACH THONG TIN BENH NHAN");
			System.out.println("2...... SUA THONG TIN BENH NHAN");
			System.out.println("3.......XOA THONG TIN BENH NHAN");
			System.out.println("----- CHON ------");
			c = sc.nextInt();
			sc.nextLine();
			switch(c) {
			
			case 1:
				System.out.println("1.......NHAP VA HIEN THI DANH SACH THONG TIN BENH NHAN");
				PatientList.createPatient();
				break;
			case 2:
				System.out.println("2...... SUA THONG TIN BENH NHAN");
				
				break;
			case 3:
				System.out.println("3.......XOA THONG TIN BENH NHAN");
				System.out.print("Nhap id benh nhan can xoa: ");
				String id = sc.nextLine();
				PatientList.deletePatient(id);
				break;
			}
			
			
		}while(c<4);
		
		
		
		
	}

}
