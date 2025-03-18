package Day07.Ex01_익명객체;

// new - interface 
public interface RemoteControl {
	// 상수 
	// 최저 속력, 최고 속력 상수를 선언하시오. 
	// * 인터페이스 변수 선언 시, (public ststic final)이 자동으로 선언(글씨체가 다름) 된다. 
	int MAX_SPEED = 300; 
	int MIN_SPEED = 0; 
	
	// 추상메소드 
	// * (public abstract) 가 자동으로 선언된다. 
	void turnOn(); 
	void turnOff(); 
	void setSpeed(int speed); 
	
	// 디폴트 메소드 
	// : 구현한 객체가 오버라이딩하지 않아도 기본으로 사용할 수 있는 메소드 
	default void parking(boolean check) {
		if ( check ) {
			System.out.println("주차 되었습니다. ");
			setSpeed(MAX_SPEED);
		}
		else { 
			System.out.println("주행 모드를 시작합니다. ");
			setSpeed(10);
		}
	}
	
	// static 메소드 
	// static은 제일 먼저 메모리할당됨 -> 객체없이 구현가능!
	// : 구현 객체가 없어도 인터페이스만으로도 호출이 가능한 메소드 
	static void changeBattery() {
		System.out.println("배터리를 교체합니다. ");
	}
	
}
