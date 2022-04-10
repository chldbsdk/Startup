package com.inhatc.persistence;

import com.inhatc.domain.ManagerVO;

public interface ManagerDAO {
	//매니저 로그인
	public ManagerVO login(ManagerVO vo) throws Exception;
}
