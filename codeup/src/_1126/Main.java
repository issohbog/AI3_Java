package _1126;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		// 1. 당첨번호 6개 배열 ans 입력받기 
				// 2. 보너스 번호 입력받기 
				// 3. 지혜번호 6개 배열 cus 입력받기
				// 4. count변수로 일치하는 번호 몇개인지 파악
				// 5. 5개인 경우만 보너스번호 일치여부 파악 
				Scanner sc = new Scanner(System.in);
				
				//1.
				int ans[] = new int[6]; 
				for (int i = 0; i < ans.length; i++) {
					ans[i] = sc.nextInt(); 
				}
				
				//2. 
				int bonus = sc.nextInt();
				
				//3.
				int cus[] = new int[6]; 
				for (int i = 0; i < cus.length; i++) {
					cus[i] = sc.nextInt(); 
				}
				
				int count = 0; 
				for (int i = 0; i < cus.length; i++) {
					for (int j = 0; j < ans.length; j++) {
						if(cus[i]== ans[j]) {
							count++; 
						}
					}
				}
				
				int bonuscount = 0; 
				
				switch (count) {
				case 6:
					System.out.println("1");
					break;
				case 5:
					for (int i : cus) {
						
						if(i == bonus) {  
							bonuscount++;
							System.out.println("2");
							break;
						}
						
					}
					if(bonuscount == 0) {
						System.out.println("3");
					}
					break;
				case 4:
					System.out.println("4");
					break;
				case 3:
					System.out.println("5");
					break;
				case 2,1:
					System.out.println("0");
					break;
				default:
					
					break;
				}

		
	}
}
