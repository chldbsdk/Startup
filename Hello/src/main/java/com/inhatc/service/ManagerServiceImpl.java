package com.inhatc.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inhatc.domain.ManagerVO;
import com.inhatc.persistence.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService {
	
	@Inject
	ManagerDAO dao;
	
	@Override
	public ManagerVO login(ManagerVO vo) throws Exception{
		return dao.login(vo);
	}
	
//	@Override
//	public String login(ManagerVO vo,HttpSession session) throws Exception {
//		String name = dao.login(vo);
//		if(name != null) { //세션 변수 저장
//			session.setAttribute("userid", vo.getUserid());
//			session.setAttribute("name", name);
//		}
//		return name;
//	}
//	
//	@Override
//	public void logout(HttpSession session) {
//		session.invalidate(); //세션 초기화
//	}
}
