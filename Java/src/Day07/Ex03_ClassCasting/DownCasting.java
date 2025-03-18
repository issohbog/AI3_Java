package Day07.Ex03_ClassCasting;

public class DownCasting {
	public static void main(String[] args) {
		// 다운 캐스팅 (강제 형 변환) 
		// * 전제 조건 : 업캐스팅 
		// - 다운 캐스팅은 업캐스팅된 부모 객체를 자식 객체로 변환하는 것
		// - 업캐스팅 		: (부모) <- (자식)
		// - 다운캐스팅 	: (자식) <- (부모)
		
		// 업캐스팅 
		Person person = new Student("김조은", 20, 1, "컴공"); 
		System.out.println( person );				// 자식메소드 따라감 
		System.out.println( person.work()); 		// 자식메소드 따라감
		
		// 다운캐스팅 
		Student student = (Student) person; 
		System.out.println( student );				// 메소드도 자식
		System.out.println( student.work());		// 메소드도 자식
		System.out.println("grade : " + student.grade);	// 변수도 자식
		System.out.println("major : " + student.major);	// 변수도 자식
	}
}
