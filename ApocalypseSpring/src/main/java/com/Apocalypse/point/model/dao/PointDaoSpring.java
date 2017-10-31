package com.Apocalypse.point.model.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.Apocalypse.core.dao.GenericDaoJdbc;
import com.Apocalypse.point.bean.PointBean;
@Repository
public class PointDaoSpring extends GenericDaoJdbc<PointBean>implements IPointDao {

	@Override
	public PointBean getPointById(int pointId) throws Exception {
		return null;
	}

	@Override
	public List<Map<String,Object>> getPoint() throws Exception {
		String sql ="select * from point";
		List<Map<String, Object>> result=getJdbcTemplate().queryForList(sql);
		System.out.println(result);
		return result;
	}

	@Override
	public PointBean getPointByName(String pointName) throws Exception {
		
		return null;
	}

	@Override
	public List<PointBean> getPoint(String pointName) throws Exception {
		
		return null;
	}

	@Override
	public void save(PointBean pointBean) throws Exception {
		
		
	}

	@Override
	public int updatePoint(PointBean pointBean) throws Exception {
		
		return 0;
	}

	@Override
	public void delete(int pointId) throws Exception {
	
		
	}

}
