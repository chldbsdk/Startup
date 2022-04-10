package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.ManagerVO;

@Repository
public class ManagerDAOImpl implements ManagerDAO{
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.MemberMapper";
	
	@Override
	public ManagerVO login(ManagerVO vo) throws Exception {
		return sqlSession.selectOne(namespace+".login",vo);
	}
}
