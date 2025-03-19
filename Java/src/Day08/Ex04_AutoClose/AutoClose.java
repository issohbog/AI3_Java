package Day08.Ex04_AutoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 * test.txt 퍄일을 입력햐여 텍스트 파일의 내용을 출력하는 프로그램 
 * 자바프로그램은 외부파일을 알지못하는 상태라서 예외처리를 해주면서 코드 작성해야함 
 * Scanner객체도 사용 후 close로 메모리를 해제해주듯이 
 * 자바프로그램에서 외부파일을 불러오기 위해 사용한 객체들을 해제해줘야한다. 
 * 
 * */
public class AutoClose {
	public static void main(String[] args) {
		
		// AutoClose 
		// try (자동으로 자원해제할 객체 생성 ) { } 
		// : finally 구문에서 close() 하지 않아도, 자동으로 자원해제 해준다. 
		// * AutoClosable 인터페이스를 구현한 클래스이어야 자동으로 자원해제 가능 
		try (
			FileInputStream	fis = new FileInputStream("test.txt");
			InputStreamReader in = new InputStreamReader(fis, "UTF-8"); 
		){
		
			int read = 0; 
			while( (read = in.read()) != -1 ) {
				System.out.print( (char) read );
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			System.err.println("지원하지 않는 인코딩 타입입니다. ");
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("입출력 관련 예외가 발생했습니다. ");
		}
		// 자원해제 코드( 위에서 autoclose 처리 해주었기 때문에 적지 않아도 된다. ) 
//		finally {
//			if( fis != null ) {
//				try {
//					fis.close();
//				} catch (Exception e) { 			// 메모리 해제 
//					e.printStackTrace();
//				}
//			}
//			if( in != null ) {
//				try {
//					in.close();
//				} catch (Exception e) {				// 메모리 해제 
//					e.printStackTrace();
//				}
//			}
//		}
		
	}
}
