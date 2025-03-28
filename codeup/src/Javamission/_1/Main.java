// 완료
package Javamission._1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		// 1. 영어, 수학, 자바성적 입력받기
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int java = sc.nextInt();
		
		// 2. 합계 구하기
		int sum = eng + math + java;
		
		// 3. 평균 구하기 
		Double avg = sum / 3.0; 
		
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println("자바 점수 : " + java);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
	}
	
	
	
}
