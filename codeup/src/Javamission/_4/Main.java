package Javamission._4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			
			for (int k = 0; k < N-1-i ; k++) {
				System.out.print(" ");
			}
			
			
			for (int j = N-i; j <= N+i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
