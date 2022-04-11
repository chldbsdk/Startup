package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.ManagerVO;
import com.inhatc.persistence.ManagerDAO;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class ManagerDAOTest {
	@Inject
	private ManagerDAO dao;
	
	@Test
	public void testInsertMember() throws Exception {
		ManagerVO vo = new ManagerVO();
		vo.setUserid("nakwon00");
		vo.setUserpw("Nakwon2022!");
		
		dao.login(vo);
		System.out.println("°á°ú"+dao.login(vo));
	}
}
