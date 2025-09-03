package jboard.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.Part;
import jboard.dao.ArticleDAO;
import jboard.dao.FileDAO;
import jboard.dto.ArticleDTO;
import jboard.dto.FileDTO;

public enum FileService {
	
	INSTANCE;
	
	private FileDAO dao = FileDAO.getInstance();
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public void fileUpload(HttpServletRequest req) {
				
		
		// 파일업로드 디렉터리 경로 생성
		ServletContext ctx = req.getServletContext();
		String path = ctx.getRealPath("/files");
		
		File uploadPath = new File(path);
		if(!uploadPath.exists()) {
			uploadPath.mkdir();
		}
				
		try {
			// 업로드 파일 Part(업로드된 파일) 첨부 파일에서 가져오기
			Part part1 = req.getPart("file1");	
			Part part2 = req.getPart("file2");	
			
			// 파일명 추출
			String oriName1 = part1.getSubmittedFileName();	
			String oriName2 = part2.getSubmittedFileName();	
			
					
			// 중복되지 않는 파일명 생성	
			String ext1 = oriName1.substring(oriName1.lastIndexOf("."));	
			String ext2 = oriName2.substring(oriName2.lastIndexOf("."));	
			String savedName1 = UUID.randomUUID().toString() + ext1;
			String savedName2 = UUID.randomUUID().toString() + ext2;
			
			// 파일 저장(경로 + 구분자 + 중복되지 않는 파일명)
			part1.write(path + File.separator + savedName1);
			part2.write(path + File.separator + savedName2);
			
		}catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		
		
	}
	
	public void fileDownload() {}
	
	
	
	
	public void register(FileDTO dto) {
		dao.insert(dto);
	}	
	public FileDTO findById(int fno) {
		return dao.select(fno);
	}
	public List<FileDTO> findAll() {
		return dao.selectAll();
	}
	public void modify(FileDTO dto) {
		dao.update(dto);
	}	
	public void remove(int fno) {
		dao.delete(fno);
	}
}
