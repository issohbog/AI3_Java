package Board_JDBC.DAO;

// 자동 IMPORT : CTRL + SHIFT + O

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Board_JDBC.DTO.Board;



/**
 *   데이터 접근 객체
 *   - 게시글 데이터를 접근
 */
public class BoardDAO extends JDBConnection {		// BoardDAO 생성될때 JDBC 객체가 기본생성자로 생성된다. 
	
	/**
	 * 데이터 목록
	 * @return List<Board> 게시글 목록 
	 */
	public List<Board> list() {
		// 게시글 목록을 담을 컬렉션 객체 생성
		// Board 객체를 동적으로 추가 가능 
		List<Board> boardList = new ArrayList<Board>();
		
		// SQL 작성
		String sql = " SELECT * "
				   + " FROM board ";
		
		// 자바프로그램 내에서 외부 프로그램(file system, database)을 접근할때 
		// 자바 프로그램이 접근 해봐야 잘 존재 하는지 알수 있다. 
		// 따라서 외부 프로그램을 접근할때는 예외처리(trycatch)를 해주는게 좋다. 
		
		try {
			
			// 1. SQL 실행 객체 생성 - Statement (stmt)
			// con(db와 연결된 객체 받아오기) 
			stmt = con.createStatement();
			
			// 2. SQL 실행 요청 -> 결과 ResultSet (rs)		
			rs = stmt.executeQuery(sql);
			
			// 3. 조회된 결과를 리스트(boardList)에 추가
			while( rs.next() ) {			// next() : 조회 결과의 다음 데이터로 이동 - iterator 반복자 처럼 사용 가능 
				Board board = new Board();
				
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명")  : 해당 컬럼의 데이터를 반환
				board.setNo( rs.getInt("no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setCreatedAt( rs.getTimestamp("created_at") );
				board.setUpdatedAt( rs.getTimestamp("updated_at") );
				
				// 게시글 목록 추가
				boardList.add(board);
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 목록 조회 시, 예외 발생");
			e.printStackTrace();
		}
		// 4. 게시글 목록 반환
		return boardList;
	}

	/**
	 * 데이터 조회
	 * @param no
	 * @return	단일 게시글 정보 
	 */
	public Board select(int no) { // 파라미터로 글 번호 넘어오면 
		
		// 게시글 정보 객체 생성
		Board board = new Board();
		
		// SQL 작성
		String sql = " SELECT * "
				   + " FROM board "
				   + " WHERE no = ? "; 	// no 가 ? 인 데이터만 조회
					// 바로 물음표 대신 값을 적지 않고 psmt 객체를 이용한다. 
		
		// 데이터 조회 : SQL 실행 객체 생성 -> SQL 실행 요청 -> 조회 결과 -> 반환
		try {
			// SQL 실행 객체 생성 - PreparedStatement (psmt)
			psmt = con.prepareStatement(sql);
			
			// ? 동적 파라미터 바인딩
			// * psmt.setXXX( 순서번호, 매핑할 값 );
			psmt.setInt( 1, no );		// 1번째 ? 파라미터에 매핑 : 첫번째 물음표에 넘어온 no 매개변수를 파라미터로 넘기겠다는 의미 
			
			// SQL 실행 요청
			rs = psmt.executeQuery();
			
			// 조회 결과 1건 가져오기
			if( rs.next() ) {
				// 결과 데이터 가져오기
				// rs.getXXX("컬럼명")  : 해당 컬럼의 데이터를 반환
				board.setNo( rs.getInt("no") );
				board.setTitle( rs.getString("title") );
				board.setWriter( rs.getString("writer") );
				board.setContent( rs.getString("content") );
				board.setCreatedAt( rs.getTimestamp("created_at") );
				board.setUpdatedAt( rs.getTimestamp("updated_at") );
			}
			
		} catch (SQLException e) {
			System.err.println("게시글 조회 시, 예외 발생");
			e.printStackTrace();
		}
		// 게시글 정보 1건 반환
		return board;
	}

	/**
	 * 데이터 등록
	 * @param board
	 * @return
	 */
	public int insert(Board board) {
		int result = 0;			// 결과 : 적용된 데이터 개수
		
		String sql = " INSERT INTO board (title, writer, content) "
				   + " VALUES( ?, ?, ? ) ";
		
		try {
			psmt = con.prepareStatement(sql);			// 쿼리 실행 객체 생성
			psmt.setString( 1, board.getTitle() );		// 1번 ? 에 title(제목) 매핑
			psmt.setString( 2, board.getWriter() );		// 2번 ? 에 writer(작성자) 매핑
			psmt.setString( 3, board.getContent() );	// 3번 ? 에 content(내용) 매핑
			result = psmt.executeUpdate();				// SQL 실행 요청
			// * executeUpdate() 
			// SQL(INSERT, UPDATE, DELETE) 실행 시 적용된 데이터 개수를 int 타입으로 받아온다.
			// ex) 게시글 1개 적용 성공 시, result : 1 
			//				    실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("게시글 등록 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 데이터 수정
	 * @param board
	 * @return
	 */
	public int update(Board board) {
		int result = 0;			// 결과 : 적용된 데이터 개수
		
		String sql = " UPDATE board "
				   + "    SET title = ? "
				   + "		 ,writer = ? "
				   + "		 ,content = ?"
				   + "		 ,updated_at = now() "
				   + " WHERE no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);			// 쿼리 실행 객체 생성
			psmt.setString( 1, board.getTitle() );		// 1번 ? 에 title(제목) 매핑
			psmt.setString( 2, board.getWriter() );		// 2번 ? 에 writer(작성자) 매핑
			psmt.setString( 3, board.getContent() );	// 3번 ? 에 content(내용) 매핑
			psmt.setInt( 4, board.getNo() );			// 4번 ? 에 no(글번호) 매핑
			result = psmt.executeUpdate();				// SQL 실행 요청
			// * executeUpdate() 
			// SQL(INSERT, UPDATE, DELETE) 실행 시 적용된 데이터 개수를 int 타입으로 받아온다.
			// ex) 게시글 1개 적용 성공 시, result : 1 
			//				    실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("게시글 수정 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 데이터 삭제
	 * @param no
	 * @return
	 */
	public int delete(int no) {
		int result = 0;			// 결과 : 적용된 데이터 개수
		
		String sql = " DELETE FROM board "
				   + " WHERE no = ? ";
		
		try {
			psmt = con.prepareStatement(sql);			// 쿼리 실행 객체 생성
			psmt.setInt( 1, no );						// 1번 ? 에 no(글번호) 매핑
			result = psmt.executeUpdate();				// SQL 실행 요청
			// * executeUpdate() 
			// SQL(INSERT, UPDATE, DELETE) 실행 시 적용된 데이터 개수를 int 타입으로 받아온다.
			// ex) 게시글 1개 적용 성공 시, result : 1 
			//				    실패 시, result : 0
		} catch (SQLException e) {
			System.err.println("게시글 삭제 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}

}