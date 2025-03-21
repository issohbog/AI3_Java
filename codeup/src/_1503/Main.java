package _1503;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] a = new int [N][N]; 
		
		int k = 1; 
		boolean sw = true; 
		for (int i = 0; i < a.length; i++) {
			
			// 정방향 
			if(sw) {
				for (int j = 0; j <N; j++) {
					a[i][j] = k++; 
				}
			}
			
			if(!sw) {
				for (int j = N-1; j >=0; j--) {
					a[i][j] = k++; 
				}
			}
			
			sw = !sw; 
			
			
			
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
		
 
	}
}
