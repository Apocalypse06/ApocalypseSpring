package com.Apocalypse.member;

import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



public class MemberService implements IMemberService {
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#checkIDPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public MemberBean checkIDPassword(String account, String pswd)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.select(account);
        // 如果mb不等於 null 而且參數 password等於mb內的password) {
        if ( mb != null && pswd.equals(mb.getPswd())) {
        	 //mb = dao.changeLastLogin(account,lastLogin,lastLogin_Ip);
        	return mb;
        }
        // 傳回null物件
		return null;
	}
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#getickets(java.lang.String)
	 */
	@Override
	public MemberBean getickets(String account)throws SQLException, ParseException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.select(account);
		System.out.println(mb.getLastLogin().getTime());
		//System.out.println(System.currentTimeMillis());
		int month= (new Date(System.currentTimeMillis())).getMonth();
		System.out.println(month+1);
		int year= (new Date(System.currentTimeMillis())).getYear();
		System.out.println(year+1900);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	       
		Date dt1 = sdf.parse( (1900+year)+"/"+(month+2)+"/1 00:00:00" );
	       if(dt1.getTime()>mb.getLastLogin().getTime()) {
	    	   mb = dao.changetickets(account);
	    	   System.out.println(6666);
	       }
	       System.out.println(777777);
		return mb;
	}
	
	
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#changeLastLogin(java.lang.String, java.sql.Timestamp, java.lang.String)
	 */
	@Override
	public MemberBean changeLastLogin(String account, java.sql.Timestamp lastLogin, String lastLogin_Ip)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.changeLastLogin(account,lastLogin,lastLogin_Ip);
          	
		return mb;
	}
	
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#select_by_email(java.lang.String)
	 */
	@Override
	public MemberBean select_by_email(String email)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.select_by_email(email);
          	
		return mb;
	}
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#select_by_id(java.lang.String)
	 */
	@Override
	public MemberBean select_by_id(String member_Id)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.select_by_id(member_Id);
          	
		return mb;
	}
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#changerole_id(java.lang.String, int)
	 */
	@Override
	public MemberBean changerole_id(String member_Id,int role_id)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.changerole_id(member_Id, role_id);
          	
		return mb;
	}
	
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#changePswd(java.lang.String, java.lang.String)
	 */
	@Override
	public MemberBean changePswd(String member_Id,String Pswd)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.changePswd(member_Id, Pswd);
          	
		return mb;
	}
	
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#checkAccount(java.lang.String)
	 */
	@Override
	public int checkAccount(String account)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.select(account);
        
        if ( mb != null) {
            return 1;
        }
        return 0;
	}
	
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#changeMember(com.Apocalypse.ProductCenter.member.MemberBean)
	 */
	@Override
	public MemberBean changeMember(MemberBean Mb)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.changeMember(Mb);
          	
		return mb;
	}
	
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#insertMember(com.Apocalypse.ProductCenter.member.MemberBean)
	 */
	@Override
	public MemberBean insertMember(MemberBean Mb)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.insertMember(Mb);
          	
		return mb;
	}
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#select_permission(int)
	 */
	@Override
	public List<Integer> select_permission(int role_id)throws SQLException {
			
			IMemberDao dao = new MemberDAO();
			List<Integer> list = dao.select_permission(role_id);
	          	
			return list;
	}
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#select_role_Name(int)
	 */
	@Override
	public String select_role_Name(int role_id)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		String role_Name = dao.select_role_Name(role_id);
          	
		return role_Name;
	}
	/* （非 Javadoc）
	 * @see com.Apocalypse.ProductCenter.member.IMemberService#changePicture(java.io.InputStream, java.lang.String, java.lang.String)
	 */
	@Override
	public MemberBean changePicture(InputStream picture ,String picture_Name,String member_Id)throws SQLException {
		
		IMemberDao dao = new MemberDAO();
		MemberBean mb = dao.changePicture(picture, picture_Name, member_Id);
          	
		return mb;
	}
}
