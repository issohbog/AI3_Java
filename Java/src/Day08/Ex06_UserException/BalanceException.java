package Day08.Ex06_UserException;

// 사용자 정의 예외 클래스 : Exception 클래스 상속받기
// - public class ?? Exception extends Exception { }

// 클래스를 하나 만들어서 BalanceException 이 예외를 강제로 발생시킨다. 
public class BalanceException extends Exception{
	
	// alt + shift + S + C : Generate Constructors from superclass
	// 위 메뉴에서 부모클래스 Exception에서 기본생성자, 매개변수 하나있는 생성자 호출하기 
	// 기본 생성자
	public BalanceException() {
		super(); 
	}
	
	// 매개변수(메시지)있는 생성자 
	public BalanceException(String message) {
		super(message); 
	}

}
