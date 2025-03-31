package Javamission._11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuNo = 0; 
		int num = 0; 

		List<Account> accountList = new ArrayList<Account>(); 
		
		do {
			System.out.println("=========================");
			System.out.println("1. 계좌 등록 ");
			System.out.println("2. 입금 ");
			System.out.println("3. 출금");
			System.out.println("4. 계좌조회");
			System.out.println("5. 계좌목록");
			System.out.println("6. 종료");
			System.out.println("=========================");
			
			
			System.out.print("입력>>");
			menuNo = sc.nextInt();
			
			switch (menuNo) {
			case 1:
				System.out.print("계좌번호>>");
				String depoNum = sc.nextLine(); 
				sc.nextLine();
				System.out.print("예금주>>");
				String depositor = sc.nextLine();
				System.out.print("최초예금액>>");
				int deposit = sc.nextInt();
				sc.nextLine();
				System.out.print("비밀번호>>");
				String secret = sc.nextLine(); 

	//			accountList.add(depoNum, depositor, deposit); 
				
				System.out.println("'김조은'님의 계좌가 개설되었습니다. ");
				break;
			case 2:
				System.out.println("========= 입금 =========");
				System.out.print("계좌번호>>");
				depoNum = sc.nextLine(); 
				sc.nextLine();
				System.out.print("입금액>>");
				deposit = sc.nextInt();
				System.out.println("'김조은'님에게 입금하는게 맞으십니까?");
				System.out.println("1. 예");
				System.out.println("2. 아니오");
				System.out.print("입력>>");
				if(num == 1) {
					//account1.setDeposit(deposit);
				}
				
				
			default:
				break;
			}

			
		} while (menuNo != 6);
		
		sc.close(); 
	}
}
