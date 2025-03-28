// 풀이중 
package Javamission._2;

import java.util.Scanner;

public class Main {
	
	// 1. 정수 N 입력받기 
	// 2. 합계 구할 변수 홀수합변수, 짝수합변수 초기화
	// - 2.1) 홀수 합만 구하도록 반복문안에 if 문 작성 
	// 			i) 해당 i와 "+" 기호룰 붙여서 출력 
	//			ii) 맨 마지막에 "=" 기호를 앞에 붙이고 sum 출력 
	// - 2.2) 짝수 합만 구하도록 반복문안에 if 문 작성 
	// 			홀수와 같은 과정 반복 
	// 3. 약수 구하기 
	// 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		int N = sc.nextInt();
		
		int oddSum = 0; 
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 1) {
				oddSum += i; 
				if(i == N || i == N-1) {
					System.out.print(i); break; 
				}
				System.out.print(i + "+");
			}
		}
		System.out.println("=" + oddSum);
		
		int evenSum = 0; 
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				evenSum += i; 
				if(i == N || i == N-1) {
					System.out.print(i); break; 
				}
				System.out.print(i + "+");
			}
		}
		System.out.print("=" + evenSum);
	}
	
}
