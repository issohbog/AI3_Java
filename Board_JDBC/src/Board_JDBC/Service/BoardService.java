package Board_JDBC.Service;


import java.util.List;

import Board_JDBC.DTO.Board;


/**
 *  게시판 프로그램 - 기능 메소드
 *  - 게시글 목록
 *  - 게시글 조회
 *  - 게시글 등록
 *  - 게시글 수정
 *  - 게시글 삭제
 */
public interface BoardService {
	
	// 게시글 목록
	List<Board> list();
	// 게시글 조회
	Board select(int no);
	
	// 등록시 필요한 정보를 board로 넘기고, 데이터가 저장된 여부를 1또는 0으로 반환 
	// 게시글 등록
	int insert(Board board);
	// 게시글 수정
	int update(Board board);
	// 게시글 삭제
	int delete(int no);
	
}