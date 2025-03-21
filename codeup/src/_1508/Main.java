package _1508;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		// 1. 배열의 행 갯수 N 입력받기 
		// 2. N의 크기를 바탕으로 2차원 배열 생성 
		// 3. 가장 왼쪽 숫자가 들어갈 위치에 숫자 입력받기(반복문)
		// 4. 나머지 칸을 반복문과 뺄셈 연산자로 채우기 
		
		int N = sc.nextInt();
		int arr[][] = new int[N][]; 
		for (int i = 0; i < N; i++) {
			arr[i] = new int[i+1]; 
		}
		
		//3.
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = sc.nextInt();
		}
		
		//4. 
		for (int j = 1; j < arr.length; j++) {
			for (int i = j; i < arr.length; i++) {
				arr[i][j] = arr[i][j-1] - arr[i-1][j-1];
			}
		}
		
		//5. 출력 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}	System.out.println();
		}
		
		
		
		//for (int i = 0; i < arr.length; i++) {
		//	System.out.print(arr[i][0]);
		//}
		
		
	}
}
