<%@page import="java.nio.file.Path"%>
<%@page import="org.apache.commons.fileupload2.core.FileItem"%>
<%@page import="org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletFileUpload"%>
<%@page import="org.apache.commons.fileupload2.core.DiskFileItemFactory"%>
<%@page import="org.apache.commons.fileupload2.core.FileItemFactory"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.io.File"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
	// 파일 업로드 디렉터리 경로 설정
	String uploadPath = application.getRealPath("/uploads");

	// 파일 업로드 디렉터리 존재하지 않으면 디렉터리 생성
	File uploadDir = new File(uploadPath);
	if(!uploadDir.exists()){
		uploadDir.mkdir();
	}
	
	// 파일 업로드 처리 객체 생성	
	FileItemFactory factory = DiskFileItemFactory.builder().get();
	JakartaServletFileUpload upload = new JakartaServletFileUpload(factory);
	
	// 최대 업로드 파일 크기 설정
	upload.setSizeMax(1024 * 1024 * 10); // 10MB
	
	// 파일 업로드 스트림 작업
	try {
		List<FileItem> items = upload.parseRequest(request);
		Iterator<FileItem> iter = items.iterator();
		
		while(iter.hasNext()){
			
			FileItem item = iter.next();
			
			// 파일 저장
			//File uploadFile = new File(uploadPath + File.separator + item.getFieldName());
			item.write(Path.of(uploadPath, "test.txt"));
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	// 다운로드 페이지 이동
	response.sendRedirect("../2.fileDownload.jsp");

%>