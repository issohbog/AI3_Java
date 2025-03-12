package Day03;

public class Ex11_OddEven {
	public static void main(String[] args) {
		// 1~20 까지 정수 중 , 
		// 홀수의 합계, 짝수의 합계를 각각 구하여 출력하시오 
		// 1+3+5+7+9+11+13+15+17+19 =???
		// 2+4+6+8+10+12+14+16+18+20 =??
		
		
		// 순서도 
		// 1. 1~20까지 반복 
		// 2. 홀수인지 짝수인지 판별 
		// 3. 홀수합계 
		// 4. 짝수합계 
		
		int oddSum = 0, evenSum = 0; 
		int a = 0; 
		
		while(a <= 20) {
			if(a % 2 == 1) {
				oddSum += a++;
			}else {
				evenSum += a++; 
			}
		}
		
		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("짝수의 합계 : " + evenSum);
		
	}
}
