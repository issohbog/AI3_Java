package Javamission._3;

public class Main {
	
	// 1. 1~100까지 출력 
	// 2. 일의 자리 수가 3, 6, 9인 경우 *출력 
	// 3. 십의 자리 수가 3, 6, 9인 경우 *출력 
	// (둘 다일때는 둘 다 출력 )
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			
			boolean num_1 = false; 
			boolean num_10 = false; 
			
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				num_10 = true; 
			}
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				num_1 = true; 	
			}
			
			if(num_1 && num_10) {
				System.out.println("**");
			} 
			else if (num_1 || num_10) {
				System.out.println("*");
			}
			else {
				System.out.println(i);
			}
			
					}
	}
	
}
