package quanlybenhnhan;
import java.util.Scanner;

public class MainTest {
	static Scanner sc = new Scanner(System.in);
	private int n;
	
	public void Create_Info() {
		System.out.println("SO LUONG BENH NHAN CAN NHAP THONG TIN ");
		n = sc.nextInt();
		Info patient[] = new Info[50];
		
		for(int i = 0;i<n;i++) {
			System.out.println("NHAP DU LIEU CHO BENH NHAN THU "+(i+1));
			patient[i] = new Info();
			patient[i].insertInfo();
				
		}
		
		for(int i=0;i<n;i++) {
			System.out.println("DU LIEU CUA BENH NHAN THU "+(i+1));
			patient[i].displayInfo();
		}
		
	}
	
	public static void main(String args[]) {
		MainTest m = new MainTest();
		
		int c;
		System.out.println("----- CHON ------");
		c = sc.nextInt();
		
		do {
			switch(c) {
			
			case 1:
				System.out.println("1.......NHAP VA HIEN THI DANH SACH THONG TIN BENH NHAN");
				m.Create_Info();
				break;
			
			}
				
			
			
		}while(c<4);
		
		
		
		
	}

}
