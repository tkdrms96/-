package com.spring.board.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.board.dao.BoardDao;
import com.spring.board.vo.BoardVo;
import com.spring.board.vo.PageVo;

@Repository
public class BoardDaoImpl implements BoardDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public String selectTest() throws Exception {
		// TODO Auto-generated method stub
		
		String a = sqlSession.selectOne("board.boardList");
		
		return a;
	}
	/**
	 * 
	 * */
	@Override
	public List<BoardVo> selectBoardList(PageVo pageVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.boardList",pageVo);
	}
	
	@Override
	public int selectBoardCnt() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.boardTotal");
	}
	
	@Override
	public BoardVo selectBoard(BoardVo boardVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("board.boardView", boardVo);
	}
	
	@Override
	public int boardInsert(BoardVo boardVo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("board.boardInsert", boardVo);
	}
	@Override
	public int boardUpdate(BoardVo boardVo) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("dao �׽�Ʈ");
		System.out.println(boardVo.getBoardNum());
		System.out.println(boardVo.getBoardTitle());
		System.out.println(boardVo.getBoardComment());

		
		return sqlSession.update("board.boardUpdate", boardVo);
		
	}
	@Override
	public int boardDelete(int boardNum) throws Exception {

		System.out.println("�ٿ� �׽�Ʈ" + boardNum);

			return sqlSession.delete("board.boardDelete", boardNum);
	}
	@Override
	public List<PageVo> selectTypeData() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("board.boardTypeList");
	}
	
	
}
