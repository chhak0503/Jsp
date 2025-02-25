package kr.co.jboard.controller.article;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/article/search.do")
public class SearchController extends HttpServlet {
	private static final long serialVersionUID = 4384445431360960261L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 데이터 수신
		String searchType = req.getParameter("searchType");
		String keyword = req.getParameter("keyword");
		
		
						
		
		
		
		
		
	
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
