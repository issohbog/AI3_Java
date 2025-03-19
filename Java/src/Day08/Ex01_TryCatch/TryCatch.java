package Day08.Ex01_TryCatch;

import java.util.Scanner;

public class TryCatch {
	
	public static void main(String[] args) {
		// try : ctrl + space 
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" a : ");
		int a = sc.nextInt();
		System.out.print(" b : ");
		int b = sc.nextInt();
		

		try {
			int result = a / b; 
			System.out.println("result : " + result);
		} catch (Exception e) {
			System.err.println("예외 발생 ");
			System.err.println("0으로 나눌 수 없습니다.");
		} finally {			// 예외 처리후 실행문 finally 블록 없이 쓰는것과 효과 동일 
			System.out.println("예외 처리 완료 ");
		}
		
		
		sc.close();
	}
}
