package _1126;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1. 정수 a, b 입력받기 
		// 2. +, -, *, /, % 프린트문 출력 
		
		int a = sc.nextInt(); 
		int b = sc.nextInt(); 
		
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " * " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));

		char[] op = {'+', '-', '*', '/', '%'};

		
		

	}
}
