package Day03;

import java.util.Scanner;

public class Ex06_Grade {
	
	public static void main(String[] args) {
		// 학점을 입력받아, 점수 구간을 출력하시오. 
		// A : 90~100점 입니다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("학점 : ");
		// String(문자열) 참조 자료형 
		String grade = sc.next();
		// * 문자, 정수, 문자열은 switch문의 조건값으로 가능하다. 
		// * 실수(float, double) 조건값으로 불가능 
		switch (grade) {
			case "A": 	System.out.println("90~100점 입니다. "); break;
			case "B": 	System.out.println("80~89점 입니다. "); break;
			case "C": 	System.out.println("70~79점 입니다. "); break;
			case "D": 	System.out.println("60~69점 입니다. "); break;
			case "F": 	System.out.println("60점 미만 입니다. "); break;
			default:	System.out.println("A~F사이의 문자를 입력해주세요."); break;
		}

	}
	
}
