package kr.or.dummys.dao;

import java.sql.SQLException;
import java.util.List;

import kr.or.dummys.dto.Board;

public interface BoardDao {
	
	//게시물 개수
	int getBoardCount(String field, String query) throws ClassNotFoundException, SQLException;
		
	//전체 게시물
	List<Board> boardList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	//게시글 작성(insert)
	int boardWrite(Board n) throws ClassNotFoundException, SQLException;
	
	//게시글 상세보기
	Board boardDetail(String seq) throws ClassNotFoundException, SQLException;
	
	//게시물 수정(update)
	int boardUpdate(Board board) throws ClassNotFoundException, SQLException;
	
	//게시물 삭제(delete)
	int boardDelete(String seq) throws ClassNotFoundException, SQLException;
}
