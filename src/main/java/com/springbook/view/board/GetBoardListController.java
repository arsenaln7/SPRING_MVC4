package com.springbook.view.board;

import java.util.List;

import javax.naming.ldap.Control;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;


public class GetBoardListController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println("글 목록 검색  처리");
		
		//1. 사용자 입력 정보 추출(검색 기능은 나중에 구현)
		//2. DB 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
		//3. 결과를 세션에 저장하고, 저장목록화면을 리턴한다.
		/*HttpSession session = request.getSession();
		session.setAttribute("boardList", boardList);
		return "getBoardList";*/
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("boardList",boardList);
//		mav.setViewName("getBoardList.jsp");
		mav.setViewName("getBoardList");
		return mav;
	}
 
}
