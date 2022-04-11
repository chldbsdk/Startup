package com.inhatc.persistence;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import com.inhatc.domain.ManagerVO;

public interface ManagerDAO {
	//매니저 로그인
	public ManagerVO login(ManagerVO vo) throws Exception;
	
	//매니저 로그인 체크
	//public String login(ManagerVO vo) throws Exception;
	
	
}
