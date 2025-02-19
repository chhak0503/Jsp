package kr.co.jboard.controller.user;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/user/check.do")
public class CheckController extends HttpServlet {

	private static final long serialVersionUID = -8567214395021632366L;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 데이터 수신
		String type = req.getParameter("type");
		String value = req.getParameter("value");
	
		// 수신된 데이터 반드시 출력해보기
		System.out.println("type : " + type + ", value : " + value); // 시스템 콘솔 이용
		logger.debug("type : " + type + ", value : " + value); // 로거 이용
		
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}







