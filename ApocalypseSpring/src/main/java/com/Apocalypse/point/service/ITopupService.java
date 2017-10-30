package com.Apocalypse.point.service;

import java.util.List;

import com.Apocalypse.member.bean.MemberBean;
import com.Apocalypse.point.bean.MemberPointBean;

public interface ITopupService {

	public MemberPointBean saveMemberPoint() throws Exception;

	public int updateMemberPoint() throws Exception;

	public List<MemberBean> queryPointRecord(String account) throws Exception;
	
	public int deleteMemberPoint()throws Exception;
}
