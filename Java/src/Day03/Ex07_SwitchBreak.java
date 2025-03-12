package Day03;

import java.util.Scanner;

public class Ex07_SwitchBreak {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// 입력 받은 정수를 5로 나눈 나머지가
		// 2보다 작으면 "*" 출력 
		// 그렇지 않으면 "**" 출력 
		// - switch문을 이용하시오 
		
		switch (num % 5) {
			// case 0, 1, 2 : 0과1에서 굳이 프린트문 작성 안해도 되는게 switch문의 중요한 특징 
			case 0 :
			case 1 :						
				System.out.println("*");
				break;
			default:
				System.out.println("**");
				break;
		}
		
		sc.close(); 
	}
}
