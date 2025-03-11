package Day02;

public class Ex05_Long {
	public static void main(String[] args) {
		// int (4byte : 32bits) : 2^32 : 약 42억개 
		// int 수 표현 범위 		: -21억xxx ~ 21억xxx
		
		// long (8bytes : 64bits) : 2^64개 
		long ln1 = 1000; 
		long ln2 = 2100000000;		//자동 형변환
		long ln3 = 2200000000L;		//22억을 int로 표현할수 없으니까 L로 바꿔서 long으로
		// ** L을 붙이지 않으면 기본 정수는 int타입으로 인식되어 21억을 표현할 수 없다. 
		
		System.out.println("ln1 : " + ln1);
		System.out.println("ln2 : " + ln2);
		System.out.println("ln3 : " + ln3);
	}
}
