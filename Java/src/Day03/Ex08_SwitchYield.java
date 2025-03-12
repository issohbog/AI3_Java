package Day03;

import java.util.Scanner;

public class Ex08_SwitchYield {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		// 입력 받은 정수를 5로 나눈 나머지가	
		// 2보다 작으면 "*" 출력 
		// 그렇지 않으면 "**" 출력 
		// - switch문을 이용하시오
		String result = switch (num % 5) {
			// 반환값만 지정하는 경우, yeild 생략하고 사용가능 
			case 0, 1 -> "*";    		 
			default -> {
				//블록의 실행문이 여러 줄인 경우 yield 필수 
				System.out.println("별 두개"); 
				// yield 반환값;
				yield "**"; 
			}
		};
		
		System.out.println(result);
		
		// yield를 사용하지 않는 경우 
		String result2; 
		switch (num % 5) {
			case 0, 1: result2 = "*"; break; 
			default: result2 = "**"; break; 
		}
		System.out.println(result2);
		sc.close();

	}
}
