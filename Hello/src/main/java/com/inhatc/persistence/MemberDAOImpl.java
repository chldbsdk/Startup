package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO{
	
	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime");
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember",vo);
	}
	
	public MemberVO readMember(String userid) throws Exception {
		return (MemberVO)sqlSession.selectOne(namespace+".selectMember",userid);
	}
}
