package Day04;

// enum(열거타입) 정의 
// - 열거타입 enum은 파이롤도 정의할 수 있고, 
// - 클래스 파일 내부에서 정의할 수 있다. 
enum Test { A, B, C, D, E, F};

public class Ex07_Enum {
	public static void main(String[] args) {
		// enum(열거타입)
		// - 요소들을 명명한 값으로 집합을 이루는 자료형 
		// 특징 
		// 1. enum을 비교할 때는 값 뿐만 아니라 타입도 비교한다. 
		// 2. enum의 상수값이 재정의되도 다시 컴파일할 필요가 없다. 
		
		// enum 관련 메소드 
		// - values() 		: 열거타입의 모든 요소를 배열로 반환 
		// - valueOf() 		: 전달 된 문자열과 일치하는 열거타입 상수를 반환 
		// - ordinal() 		: 해당 열거타입 상수가 정의된 순서(index)를 반환 
		
		Rainbow[] rainbow = Rainbow.values();
		
		for (Rainbow color : rainbow) {
			System.out.print(color + " ");
		}
		System.out.println();
		
		Rainbow G = Rainbow.valueOf("PURPLE");
		System.out.println("G : " + G);
		
		int index = G.ordinal();		//열거 타입 요소중에 몇 번째에 있는지 
		System.out.println("PURPLE 의 index : " + index);
		
	}
}
