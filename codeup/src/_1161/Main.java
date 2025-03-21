package _1161;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		
		//짝+짝 = 짝
		//짝+홀 = 홀
		//홀+홀 = 짝 
		//홀+짝 = 홀 
		
		Scanner sc = new Scanner(System.in);
		System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int devideA = a % 2;
		int devideB = b % 2; 
		
		if(a % 2 == 1) {
			System.out.print("홀수");	
		}
		else {
			System.out.print("짝수");
		}
		
		System.out.print("+");
		
		if(b % 2 == 1) {
			System.out.print("홀수");	
		}
		else {
			System.out.print("짝수");
		}
		
		System.out.print("=");
		
		if(devideA == devideB) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
	}
		
		
		
}

