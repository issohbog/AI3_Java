package board;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BoardInterface boardInterface = new BoardAccess(); 
		Scanner sc = new Scanner(System.in);
		
		int menuNo; 
		
		do {
			System.out.println("::::: 게시판 :::::");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			menuNo = sc.nextInt();
			sc.nextLine();
			if(menuNo == 0) break; 
			
			switch (menuNo) {
			case 1: 	// 게시글 목록
						Board[] boardList = boardInterface.list(); 
						if(boardList != null) 
							for (Board board : boardList) {
								System.out.println(board);
							}
						break;
						
			case 2: 	// 게시글 등록
						System.out.println("제목 : ");
						String title = sc.nextLine(); 
						System.out.println("작성자 : ");
						String writer = sc.nextLine(); 
						System.out.println("내용 : ");
						String content = sc.nextLine(); 
						
						Board board = new Board(title, writer, content); 
						Board createdBoard = boardInterface.create(board); 
						
						if( createdBoard != null ) {
							System.out.println("::::: 등록된 게시글 정보:::::");
							System.out.println(createdBoard);
						}
						break;
		
			case 3: 	// 게시글 조회 
						System.out.println("조회할 게시글 번호를 입력하세요.");
						int no = sc.nextInt();
						Board oneboard = boardInterface.read(no);
						System.out.println(oneboard);
						break; 
						
			case 4: 	// 게시글 수정		
						System.out.println("수정할 게시글 번호를 입력하세요.");
						no = sc.nextInt();
						
						sc.nextLine();					//  enter 초기화
						
						System.out.println("제목 : ");
						title = sc.nextLine(); 
						System.out.println("작성자 : ");
						writer = sc.nextLine(); 
						System.out.println("내용 : ");
						content = sc.nextLine(); 

						
						Board upboard = new Board(no, title, writer, content);
						boolean successUpdate = boardInterface.update(upboard);
						
						if(successUpdate == true) {
							System.out.println("게시글 수정에 성공하였습니다. ");
						}
						break;
						
			case 5: 	// 게시글 삭제
						System.out.println("삭제할 게시글 번호를 입력하세요");
						no = sc.nextInt();
						
						boolean successDelete = boardInterface.delete(no);
						
						if(successDelete == true) {
							System.out.println("게시글을 삭제하였습니다. ");
						}
						
						break; 
			default:
				break;
			}
			
			
		} while (true);

		sc.close();
	}
}
