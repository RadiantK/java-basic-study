package com.nonsense.config;

import com.nonsense.dao.NonsenseDao;
import com.nonsense.dao.UserDao;
import com.nonsense.print.UserAllPrinter;
import com.nonsense.print.NonsenseAllPrinter;
import com.nonsense.print.UserSelectPrinter;
import com.nonsense.service.NonsenseSolve;
import com.nonsense.service.RankingInfoSaveFile;
import com.nonsense.service.UserChangePassword;
import com.nonsense.service.UserRegist;
import com.nonsense.service.UserWithdraw;

public class Config {

	private UserDao userDao;
	private UserChangePassword userChangePassword;
	private UserRegist userRegist;
	private UserAllPrinter allPrinter;
	private UserSelectPrinter selectPrinter;
	private UserWithdraw userWithdraw;
	private NonsenseDao nonsenseDao;
	private NonsenseSolve nonsenseSolve;
	private NonsenseAllPrinter nonsenseAllPrinter;
	private RankingInfoSaveFile rankingInfoSaveFile;
	
	public Config() {
		// 생성자를 통해서 주입받는 형식
		userDao = new UserDao(); 
		nonsenseDao = new NonsenseDao();
		userChangePassword = new UserChangePassword(userDao);
		userRegist = new UserRegist(userDao);
		userWithdraw = new UserWithdraw(userDao, nonsenseDao);
		nonsenseSolve = new NonsenseSolve(userDao, nonsenseDao);
		nonsenseAllPrinter = new NonsenseAllPrinter(nonsenseDao);
		rankingInfoSaveFile = new RankingInfoSaveFile(nonsenseDao);
		
		// setter메소드를 통해서 주입받는 형식
		allPrinter = new UserAllPrinter();
		allPrinter.setUserDao(userDao);
		selectPrinter = new UserSelectPrinter();
		selectPrinter.setUserDao(userDao);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public NonsenseDao getNonsenseDao() {
		return nonsenseDao;
	}

	public UserChangePassword getUserChangePassword() {
		return userChangePassword;
	}

	public UserRegist getUserRegist() {
		return userRegist;
	}

	public UserAllPrinter getAllPrinter() {
		return allPrinter;
	}

	public UserSelectPrinter getSelectPrinter() {
		return selectPrinter;
	}
	
	public UserWithdraw getUserWithdraw() {
		return userWithdraw;
	}
	
	public NonsenseSolve getNonsenseSolve() {
		return nonsenseSolve;
	}
	
	public NonsenseAllPrinter getNonsenseAllPrinter() {
		return nonsenseAllPrinter;
	}
	
	public RankingInfoSaveFile getRankingInfoSaveFile() {
		return rankingInfoSaveFile;
	}

}
