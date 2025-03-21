package _1205;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(); 
		double b = sc.nextDouble(); 
		double max = Integer.MIN_VALUE; 
		double result[] = new double[10]; 
		
		result[0] = a + b; 
		result[1] = b + a; 
		result[2] = a - b; 
		result[3] = b - a; 
		result[4] = a * b; 
		result[5] = b * a; 
		result[6] = a / b; 
		result[7] = b / a;
		result[8] = Math.pow(a, b); 
		result[9] = Math.pow(b, a);
		
		
		for (double d : result) {
			if(max < d) {
				max = d;
			}
		}
		System.out.printf("%f", max);
		
		

	}
}
