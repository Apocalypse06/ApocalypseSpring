package com.Apocalypse.member;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
@Repository
public class MemberDao extends JdbcDaoSupport implements IMemberDao {
	private MemberBean memberBean=new MemberBean();
	
	@Override
	public MemberBean select(String account) throws SQLException {
		Properties properties =new Properties();
		String sql="select * from member where account=?";
		getJdbcTemplate().query(sql, new String[]{account},new RowCallbackHandler(){
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				memberBean.setAccount(account);
				memberBean.setBirthday(rs.getDate("birthday"));
				
			}});
		return null;
	}

	@Override
	public MemberBean select_by_id(String memberId) throws SQLException {

		return null;
	}

	@Override
	public MemberBean select_by_email(String email) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean changeLastLogin(String account, Timestamp lastLogin, String lastLoginIp) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean changetickets(String account) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean insertMember(MemberBean bean) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean changeMember(MemberBean bean) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean changerole_id(String memberId, int roleid) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean changePswd(String memberId, String Pswd) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public List<Integer> select_permission(int roleId) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public String select_role_Name(int roleId) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

	@Override
	public MemberBean changePicture(InputStream picture, String pictureName, String memberId) throws SQLException {
		// TODO 自動產生的方法 Stub
		return null;
	}

}
