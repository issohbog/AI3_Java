package Javamission._8;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1; 
		int arr[][] = new int[N][N]; 
		boolean flag = false;
		for (int i = 0; i < N; i++) {
			if(!flag) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = count;
					count++; 
				}	
			}
			if(flag) {
				for (int j = N-1; j >= 0; j--) {
					arr[i][j] = count; 
					count++; 
				}
			}
			flag = !flag;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]);
			}System.out.println();
		}
			
	
		
	}
	

}
