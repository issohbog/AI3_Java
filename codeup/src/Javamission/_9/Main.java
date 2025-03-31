package Javamission._9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 1. 이름과 간식비 지급액 입력받기 
		// 2. 변수 paper에 화폐금액 50000원 설정하기 
		// 3. 50000원권 몇장 필요한지 계산 후 출력 
		// 4. 변수 paper를 10000원으로 설정하기 (/5)
		// 5. 동일한 과정 후 5000원으로 설정하기 (/2) 
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine(); 
		int snackMoney = sc.nextInt();
		
		int paper = 50000; 		

		int divied = 5; 
		int count = 0; 

		System.out.println("성명 출장비 오만원 만원 오천원 천원 오백원 백원 오십원 십원 오원 일원 ");
		
		System.out.print(name);
		System.out.print(snackMoney+ " ");
		
		while (paper >= 1) {
			
			count = snackMoney/paper; 
			System.out.print(count + "     ");
			snackMoney %= paper;
			paper /= divied;
			
			if (divied == 5) {
				divied = 2; 
			} else {
				divied = 5; 
			}
			
		}
		
	}
}
