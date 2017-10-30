package com.Apocalypse.member.service;

import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.Apocalypse.member.bean.MemberBean;

public interface IMemberService {

	MemberBean checkIDPassword(String account, String pswd) throws SQLException;

	MemberBean getickets(String account) throws SQLException, ParseException;

	MemberBean changeLastLogin(String account, java.sql.Timestamp lastLogin, String lastLogin_Ip) throws SQLException;

	MemberBean select_by_email(String email) throws SQLException;

	MemberBean select_by_id(String member_Id) throws SQLException;

	MemberBean changerole_id(String member_Id, int role_id) throws SQLException;

	MemberBean changePswd(String member_Id, String Pswd) throws SQLException;

	int checkAccount(String account) throws SQLException;

	MemberBean changeMember(MemberBean Mb) throws SQLException;

	MemberBean insertMember(MemberBean Mb) throws SQLException;

	List<Integer> select_permission(int role_id) throws SQLException;

	String select_role_Name(int role_id) throws SQLException;

	MemberBean changePicture(InputStream picture, String picture_Name, String member_Id) throws SQLException;

}