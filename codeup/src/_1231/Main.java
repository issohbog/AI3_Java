package _1231;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String cal = sc.nextLine();
		
		int result = 0; 
		
		if (cal.contains("+")) {
			String[] num = cal.split("\\+"); 
			int a = Integer.parseInt(num[0]); 
			int b = Integer.parseInt(num[1]); 
			result = a + b; 			
			System.out.println(result);

		} else if (cal.contains("-")) {
			String[] num = cal.split("-"); 
			int a = Integer.parseInt(num[0]); 
			int b = Integer.parseInt(num[1]); 
			result = a - b; 			
			System.out.println(result);

		} else if (cal.contains("*")) {
			String[] num = cal.split("\\*"); 
			int a = Integer.parseInt(num[0]); 
			int b = Integer.parseInt(num[1]); 
			result = a * b; 		
			System.out.println(result);
		} else {
			String[] num = cal.split("/"); 
			int a = Integer.parseInt(num[0]); 
			int b = Integer.parseInt(num[1]); 
			double divideResult = a / (double)b; 
			System.out.printf("%.2f", divideResult);
			 
		}
		
		
		
		
		
		
//		System.out.print("실수 : ");
//		double num = sc.nextDouble();
//		
//		System.out.println(num);
//		System.out.printf("%f, %f \n", num , 3.14);
//		
//		System.out.printf("%.2f", num);
//		
		sc.close();
		
		
		
		
		
		
	}
}
