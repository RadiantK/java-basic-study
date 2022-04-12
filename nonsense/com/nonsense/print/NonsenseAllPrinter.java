package com.nonsense.print;

import java.util.List;

import com.nonsense.dao.NonsenseDao;
import com.nonsense.entity.NonsenseUser;

public class NonsenseAllPrinter {

	private NonsenseDao nonsenseDao;

	public NonsenseAllPrinter(NonsenseDao nonsenseDao) {
		this.nonsenseDao = nonsenseDao;
	}
	
	public void print() {
		List<NonsenseUser> list = nonsenseDao.userList();
		
		System.out.println("<< 순위(점수가 같다면 이름순) >>");
		list.stream().sorted((n1, n2) -> {
			if(n1.getScore() > n2.getScore()) return -1;
			else if(n1.getScore() < n2.getScore()) return 1;
			else {
				return n1.getName().compareTo(n2.getName());
			}
		}).forEach(s -> System.out.printf(
				"[ 아이디=%s, 이름=%s, 맞춘갯수=%d, 등급=%s, 등록일=%tF ]\n",
				s.getId(), s.getName(), s.getScore(), s.getGrade(), s.getRegDate()));
	}
}
