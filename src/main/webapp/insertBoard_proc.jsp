<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
/* //1. ����� �Է� ���� ����
request.setCharacterEncoding("EUC_KR");
String title=request.getParameter("title");
String writer=request.getParameter("writer");
String content=request.getParameter("content");

//2. DB ���� ó��
BoardVO vo = new BoardVO();
vo.setTitle(title);
vo.setWriter(writer);
vo.setContent(content);

BoardDAO boardDAO = new BoardDAO();
boardDAO.insertBoard(vo);

//3. ȭ�� �׺���̼�
response.sendRedirect("getBoardList.jsp"); */
%>