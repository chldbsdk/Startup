package com.inhatc.persistence;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Repository;

import com.inhatc.domain.ManagerVO;

public interface ManagerDAO {
	//�Ŵ��� �α���
	public ManagerVO login(ManagerVO vo) throws Exception;
	
	//�Ŵ��� �α��� üũ
	//public String login(ManagerVO vo) throws Exception;
	
	
}
