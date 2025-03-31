package Javamission._6;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("몇 게임?");
		int N = sc.nextInt();
		int arr[] = new int[6];
		
		Random random = new Random(); 

		for (int i = 1; i <= N; i++) {
			System.out.print("["+ i + " 게임] : ");
			
			int lastNum = 0; 
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = random.nextInt(45) + 1;
				lastNum = arr[j];
				
				for (int j2 = 0; j2 < j; j2++) {
					if(arr[j2] == lastNum) {
						j--;
					}
				}
			}
			
		
			
			
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
		

		
	}
}
