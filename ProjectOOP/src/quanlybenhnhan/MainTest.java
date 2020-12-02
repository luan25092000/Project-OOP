package quanlybenhnhan;
import java.util.Scanner;

public class MainTest {
	static Scanner sc = new Scanner(System.in);
	private int n;
	Info patient[] = new Info[50];
	
	public void Create_Info() {
		System.out.println("SO LUONG BENH NHAN CAN NHAP THONG TIN ");
		n = sc.nextInt();
		
		for(int i = 0;i<n;i++) {
			System.out.println("NHAP DU LIEU CHO BENH NHAN THU "+(i+1));
			patient[i] = new Info();
			patient[i].insertInfo();
				
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("DU LIEU CUA BENH NHAN THU "+(i+1));
			patient[i].displayInfo();
		}
		
	} // chinh sua thong tin benh nhan dua tren id
	public void edit_info() {
		System.out.println("NHAP MA SO BENH NHAN CAN CHINH SUA: ");
		String Identification=sc.next();
		boolean check =false;
		for (int i=0;i<n;i++) {
			if( Identification.equals(patient[i].getId())) {
				check=true;
				System.out.println("NHAP THONG TIN BENH NHAN CAN CHINH");
				patient[i].insertInfo();
			}
		}
		if (!check) {
			System.out.println("MA BENH NHAN KHONG HOP LE! ");
		}
		else {
			for (int i=0;i<n;i++) {
				System.out.println("DU LIEU CUA BENH NHAN THU "+(i+1));
				patient[i].displayInfo();
			}
		}
	}
	
	public static void main(String args[]) {
		MainTest m = new MainTest();
		
		int c;
		
		do {
			System.out.println("1.......NHAP VA HIEN THI DANH SACH THONG TIN BENH NHAN");
			System.out.println("2...... SUA THONG TIN BENH NHAN");
			System.out.println("----- CHON ------");
			c = sc.nextInt();
			switch(c) {
			
			case 1:
				System.out.println("1.......NHAP VA HIEN THI DANH SACH THONG TIN BENH NHAN");
				m.Create_Info();
				break;
			case 2:
				System.out.println("2...... SUA THONG TIN BENH NHAN");
				m.edit_info();
				break;
			}
				
			
			
		}while(c<4);
		
		
		
		
	}

}