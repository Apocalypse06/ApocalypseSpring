package com.Apocalypse.member.dao;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import com.Apocalypse.member.bean.MemberBean;

public interface IMemberDao {

	MemberBean select(String account) throws SQLException;

	MemberBean select_by_id(String member_Id) throws SQLException;

	MemberBean select_by_email(String email) throws SQLException;

	MemberBean changeLastLogin(String account, java.sql.Timestamp lastLogin, String lastLogin_Ip) throws SQLException;

	MemberBean changetickets(String account) throws SQLException;

	MemberBean insertMember(MemberBean bean) throws SQLException;

	MemberBean changeMember(MemberBean bean) throws SQLException;

	MemberBean changerole_id(String member_Id, int role_id) throws SQLException;

	MemberBean changePswd(String member_Id, String Pswd) throws SQLException;

	List<Integer> select_permission(int role_id) throws SQLException;

	String select_role_Name(int role_id) throws SQLException;

	MemberBean changePicture(InputStream picture, String picture_Name, String member_Id) throws SQLException;

}