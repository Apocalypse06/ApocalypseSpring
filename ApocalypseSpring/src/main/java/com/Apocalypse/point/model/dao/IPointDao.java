package com.Apocalypse.point.model.dao;

import java.util.List;
import java.util.Map;

import com.Apocalypse.point.bean.PointBean;

public interface IPointDao {
	public PointBean getPointById(int pointId) throws Exception;

	public PointBean getPointByName(String pointName) throws Exception;

	public List<PointBean> getPoint(String pointName) throws Exception;

	public List<Map<String,Object>> getPoint() throws Exception;

	public void save(PointBean pointBean) throws Exception;

	public int updatePoint(PointBean pointBean) throws Exception;

	public void delete(int pointId) throws Exception;

}