package com.inhatc.service;

import javax.servlet.http.HttpSession;

import com.inhatc.domain.ManagerVO;

public interface ManagerService {
//	public ManagerVO login(ManagerVO vo, HttpSession session);
	public ManagerVO login(ManagerVO vo) throws Exception;
}
