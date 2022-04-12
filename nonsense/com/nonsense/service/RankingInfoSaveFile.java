package com.nonsense.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.nonsense.dao.NonsenseDao;
import com.nonsense.entity.NonsenseUser;

public class RankingInfoSaveFile {
	
	private NonsenseDao nonsenseDao;

	public RankingInfoSaveFile(NonsenseDao nonsenseDao) {
		this.nonsenseDao = nonsenseDao;
	}
	
	public void saveFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);	
		
		if(!file.exists()) {
			file.mkdir(); // 파일경로가 존재하지 않으면 디렉토리를 생성.
		}
		
		PrintWriter pw = 
				new PrintWriter(new FileOutputStream(file.getAbsolutePath()+"\\Ranking.txt"), true);
		List<NonsenseUser> list = nonsenseDao.userList();
		
		int i = 1;
		for(NonsenseUser u : list) {
			pw.write("["+i+"위 >> 아이디="+u.getId()+", 이름="+u.getName()+
					", 맞춘갯수="+u.getScore()+", 등급="+u.getGrade()+
					", 등록일="+u.getRegDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))+" ]\n");
			i++;
		}
		
		pw.close();
	}
}
