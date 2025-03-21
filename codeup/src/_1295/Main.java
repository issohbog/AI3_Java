package _1295;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		char[] arr = str.toCharArray(); 
		
		for (int i = 0; i < arr.length; i++) {
			if(Character.isUpperCase(arr[i])) {
				arr[i] = Character.toLowerCase(arr[i]); 
			} 
			else {
				arr[i] = Character.toUpperCase(arr[i]); 
			}
		}
		
		for (char c : arr) {
			System.out.print(c);
		}
		
		sc.close();
	}

}

