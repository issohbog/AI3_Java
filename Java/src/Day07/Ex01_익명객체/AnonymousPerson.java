package Day07.Ex01_익명객체;

public class AnonymousPerson {
	
	// 익명 자식 객체 생성 
	// - 부모클래스 객체명 = new 부모클래스(){ 익명객체 정의 }
	
	// 클래스를 따로 정의하지 않고 부모 클래스를 즉석에서 상속하여 구현하는 방식 
	// Person을 상속하는 익명 자식 객체 person1 생성
	Person person1 = new Person() {
		// 이 영역은 마치 자식 클래스 영역과 같다. 

		// 부모클래스인 Person클래스의 work() 메소드 오버라이딩(기본 동작 변경) 
		@Override
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍을 합니다!");
			System.out.println();
		}
		
		
	}; 
		

	// Person을 상속하는 익명 자식 객체 person2 생성
	Person person2 = new Person() {
		// 이 영역은 마치 자식 클래스 영역과 같다. 
	
		@Override
		void work() {
			System.out.println(name + "(" + age + ")");
			System.out.println("프로그래밍을 합니다.");
			System.out.println();
		}
		
		
	}; 
	
	void method() {
		person1.name = "김조은"; 
		person1.age = 20; 
		person1.work();
		
		person2.name = "백종원";
		person2.age = 40; 
		person2.work();
	}
	
	
}