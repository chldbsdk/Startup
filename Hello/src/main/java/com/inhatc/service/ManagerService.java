package com.inhatc.service;

import javax.servlet.http.HttpSession;

import com.inhatc.domain.ManagerVO;

public interface ManagerService {
//	public ManagerVO login(ManagerVO vo, HttpSession session);
	public ManagerVO login(ManagerVO vo) throws Exception;
	
//	public String login(ManagerVO vo,HttpSession session) throws Exception;
//	public void logout(HttpSession session) throws Exception;
	
	
}
