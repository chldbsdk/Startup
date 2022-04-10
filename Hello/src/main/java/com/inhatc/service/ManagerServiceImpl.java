package com.inhatc.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.inhatc.domain.ManagerVO;
import com.inhatc.persistence.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Inject
	ManagerDAO dao;
	
//	@Override
//	public String login(ManagerVO vo, HttpSession session){
//		String userid = dao.login(vo);
//		if (userid != null) {
//			session.setAttribute("userid", vo.getUserid());
//		}
//		return userid;
//	}
	
	@Override
	public ManagerVO login(ManagerVO vo) throws Exception {
		return dao.login(vo);
	}
}
