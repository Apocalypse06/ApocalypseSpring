package com.Apocalypse.member;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

public interface IMemberDao {

	

	public MemberBean select(String account) throws SQLException;

	public MemberBean select_by_id(String memberId) throws SQLException;

	public MemberBean select_by_email(String email) throws SQLException;

	public MemberBean changeLastLogin(String account, java.sql.Timestamp lastLogin, String lastLoginIp) throws SQLException;

	public MemberBean changetickets(String account) throws SQLException;

	public MemberBean insertMember(MemberBean bean) throws SQLException;

	public MemberBean changeMember(MemberBean bean) throws SQLException;

	public MemberBean changerole_id(String memberId, int roleid) throws SQLException;

	public MemberBean changePswd(String memberId, String Pswd) throws SQLException;

	public List<Integer> select_permission(int roleId) throws SQLException;

	public String select_role_Name(int roleId) throws SQLException;

	public MemberBean changePicture(InputStream picture, String pictureName, String memberId) throws SQLException;

}