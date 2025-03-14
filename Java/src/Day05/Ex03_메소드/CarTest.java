package Day05.Ex03_메소드;

public class CarTest {
	public static void main(String[] args) {
		// 객체 생성 
		Car car = new Car(); 
		car.model = "제네시스";
		// car.speed = 130; 
		// private 으로 지정한 변수는 외부에서 접근 불가 
		
		// -> set메소드로 우회적으로 접근하고 
		car.setSpeed(200);
		
		
		System.out.println("model : " + car.model);
		// -> get메소드로 가져오기 
		System.out.println("speed : " + car.getSpeed());
		
		// 속도를 직접 접근 car.speed = 500; 하면 바꿀방법이 없으니 
		// setter에서 직접 관리 => 객체지향의 중요한 특징 : 캡슐화 구현!! 
		car.setSpeed(-50); 
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(400); 
		System.out.println("speed : " + car.getSpeed());
		
		car.setSpeed(130); 
		System.out.println("speed : " + car.getSpeed());
		
	}
}
