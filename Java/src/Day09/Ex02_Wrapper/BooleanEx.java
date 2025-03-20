package Day09.Ex02_Wrapper;


import java.util.Scanner;

public class BooleanEx {

	public static void main(String[] args) {
		// Boolean
		// boolean -> Boolean
		// : 불타입인 boolean 기본타입을 객체화한 클래스
		Integer i = 100;
		Boolean b = (i < 40);
		System.out.println( Boolean.toString(b) + "입니다.");		// false 	->	"false"
		System.out.println( Boolean.parseBoolean("false"));		// "false" 	-> 	false
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		boolean check = Boolean.parseBoolean( sc.nextLine() );		//문자열 입력받은 것을 boolean 타입으로 변환 , 대문자로 입력한 경우에도 boolean 타입으로 잘 바꿔줌 
		if( check ) {
			System.out.println("\"true\" 를 입력하였습니다.");
		}
		else {
			System.out.println("\"true\" 가 아닙니다.");
		}
		sc.close();
	}
}





